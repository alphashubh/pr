package com.cognizant.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.dao.ViewEducationLoanDao;
import com.cognizant.entity.ApplyEducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyEducationLoanService;

@Controller
public class EducationLoanController {
	@Autowired
	ApplyEducationLoanService educationLoanService;
	@Autowired
	ViewEducationLoanDao viewEducationLoan;
	private List<ApplyEducationLoan> educationLoanList;
	@RequestMapping(value="/addEducationLoan", method=RequestMethod.GET)
	public String getEmployee(@ModelAttribute("loan") @Valid ApplyEducationLoan loan,
			BindingResult result, Model model){
		
		return "EducationLoan";
	}
	@RequestMapping(value = "/addEducationLoan", method = RequestMethod.POST)
	public String addMember(@ModelAttribute("loan") @Valid ApplyEducationLoan loan,
			BindingResult result, 
			Model model){
		/*educationLoanList = new ArrayList<ApplyEducationLoan>();	
			educationLoanList.add(loan);*/
		long accountNumber=1254785855236142l;
			System.out.println(loan);
			educationLoanService.insertEducationLoan(loan,accountNumber);
			model.addAttribute("m1", loan.getEduLoanAccountNumber());
			/*try{
				
			}
			
		catch (ConstraintViolationException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
				Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
				while(iterator.hasNext()){
					ConstraintViolation<?> next = iterator.next();
					System.out.println("Validation message: "+next.getMessage());
					System.out.println("Invalid field: "+next.getPropertyPath());
					System.out.println("Validation class/bean: "+next.getRootBean());
//					 result.reject(next.getPropertyPath(), next.getMessage());
					result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
//					result.rejectValue(arg0, arg1, arg2);
				}
		}*/
		return "Output";
	}
	
	
	}

