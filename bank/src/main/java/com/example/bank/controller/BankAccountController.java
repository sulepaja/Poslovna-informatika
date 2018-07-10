package com.example.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.model.BankAccount;
import com.example.bank.service.BankAccountService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/public/bankAccounts")
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	
	@RequestMapping(
			value = "/getAll", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BankAccount>  getCinemas() {
		
		
		return bankAccountService.getAll();
		
	}
	
	
	@RequestMapping(
			value = "/registerBankAccount",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean registerBankAccount(@RequestBody BankAccount account) {
		
		try {
			
			bankAccountService.registerCinema(account);
			return true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
		
	}

}
