package com.cognizant.controller;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.exception.TransactionTypeExceptions;
import com.cognizant.service.PerformTransactionService;

@Controller
public class PerformTransactionController {

	@Autowired
	PerformTransactionService performtransactionservice;
	
	
	
	@RequestMapping(value="/performtransaction", method=RequestMethod.GET)
	public String getTransactionDetails(@ModelAttribute("Transaction") @Valid TransactionDetails Transaction,
			BindingResult result, Model model){
		return "PerformTransaction";
		
	}
	
	@RequestMapping(value="/performtransaction", method=RequestMethod.POST)
	public String performTransaction(@ModelAttribute("Transaction") @Valid TransactionDetails Transaction,
			BindingResult result, Model model){
			long accountNumber=1254785855236142l;
			
			
			try {
				performtransactionservice.updateTransactionDetails(Transaction, accountNumber);
				model.addAttribute("m1", Transaction.getTransactionId());
			} catch (TransactionTypeExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	//for view Transaction
	
	/*@RequestMapping(value="/viewtransaction", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<TransactionDetails> List()
		{
		long accountNumber=1254785855236142l;
		List<TransactionDetails> t=new ArrayList<>();
		t=performtransactionservice.retriveTransactionDetails(accountNumber);
		System.out.println("Controller"+t);
		return t;
	}*/
	if(result.hasErrors()){
		return "PerformTransaction";
	}
	else{
		return "SuccessTransaction";
	}
	}
	
}
