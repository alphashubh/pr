package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.dao.ViewEducationLoanDao;
import com.cognizant.entity.ApplyEducationLoan;
import com.cognizant.entity.UserDetails;

@Controller
public class HomePageController {
	@Autowired
	ViewEducationLoanDao viewEducationLoan;
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage(){
	
	
	return "Home";
}
@RequestMapping(value="/homepage",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody  List<UserDetails> getList(){
	
long accountNumber=1254785855236142l;
	
	UserDetails userDetails=viewEducationLoan.findEducationLoanDetails(accountNumber);
	
List<UserDetails> List=new ArrayList<UserDetails>();
userDetails.setApply(null);
userDetails.setHomeLoan(null);
userDetails.setTransactionDetails(null);

List.add(userDetails);

	return List;
}
}
