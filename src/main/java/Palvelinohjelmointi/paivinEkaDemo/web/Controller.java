package Palvelinohjelmointi.paivinEkaDemo.web;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Controller-luokan metodit käsittelevät clientin pyynnöt l. requestit ja välittämään
//vastaukset l. responset

@org.springframework.stereotype.Controller
public class Controller {

	
	@RequestMapping("hello")	//Mapping ohjaa, mihin end pointiin metodi vastaa. Nyt vain hello-sisältävät url-osoitteet ohjaavat tähän metodiin
	@ResponseBody				//responseBody: palaute clientille esitetään sellaisenaan leipätekstinä, eli nyt Hi you!
	public String sayGreetings(@RequestParam(name = "location") String location,
			@RequestParam(name = "name") String name) {
		return "Welcome to the " + location + ", " + name + "!";
	}
	
	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page";
	}
	
}
