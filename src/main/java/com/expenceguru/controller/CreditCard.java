package com.expenceguru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CreditCard {
	
	@RequestMapping(path="/register", method = RequestMethod.GET)
	public String registerCreditCard() {
		
		return "card has been registered";
	}

}
