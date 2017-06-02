package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.cognizant.service.PerformTransactionService;
@Controller
public class ViewTransactionController {

	@Autowired
	PerformTransactionService performtransactionservice;
	
	@RequestMapping(value="/viewtransaction", method=RequestMethod.GET)
	public  String getList()
	{
	//long accountNumber=1254785855236142l;
	return "ViewTransactionDetails";
}
	
	
	@RequestMapping(value="/viewtransaction1", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<TransactionDetails> List()
	{
	long accountNumber=1254785855236142l;
	//performtransactionservice.retriveTransactionDetails(accountNumber);
	System.out.println(performtransactionservice.retriveTransactionDetails(accountNumber));
	List<TransactionDetails> t=new ArrayList<>();	
	t=performtransactionservice.retriveTransactionDetails(accountNumber);
	/*List<TransactionDetails> t1=new ArrayList<>();
	t1=performtransactionservice.retriveTransactionDetails(accountNumber);
	for(int i=0;i<t1.size();i++){
		TransactionDetails tobj=null;
	tobj=t1.get(i);
	tobj.setUserdetails(null);
	t.add(tobj);
	}*/
	System.out.println("Controller"+t);
	return t;
}
}
