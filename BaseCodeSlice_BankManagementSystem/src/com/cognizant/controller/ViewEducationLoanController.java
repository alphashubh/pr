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
public class ViewEducationLoanController {
	@Autowired
	ViewEducationLoanDao viewEducationLoan;
@RequestMapping(value="/view", method=RequestMethod.GET)
	public String getEducationLoan(){
	
	
	return "ViewEducationLoan";
}
@RequestMapping(value="/viewEducationloan",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody  List<UserDetails> methodist(){
	
long accountNumber=1254785855236142l;
	
	UserDetails userDetails=viewEducationLoan.findEducationLoanDetails(accountNumber);
	
	userDetails.setHomeLoan(null);
	userDetails.setTransactionDetails(null);

	/*educationLoanList = new ArrayList<>();
	educationLoanList=	userDetails.getApply();
UserDetails	userDetails=new UserDetails(1234567891234567l,"Saving","Raj",1000000.00);*/
	//UserDetails	userDetails=new UserDetails(1234567891234567l,"Saving","Raj",1000000.00);
List<UserDetails> List=new ArrayList<UserDetails>();
List<ApplyEducationLoan> eduList=new ArrayList<>();
List<ApplyEducationLoan> newEduList=new ArrayList<>();
eduList=userDetails.getApply();
for(int i=0;i<eduList.size();i++){
	ApplyEducationLoan obj=null;
	obj=eduList.get(i);
	obj.setUser(null);
	newEduList.add(obj);	
}

/*for(int i=0;i<9;i++){
newEduList.add(i, eduList .get(i));
}*/
userDetails.setApply(newEduList);
List.add(userDetails);

	return List;
}

}
