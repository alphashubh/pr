package com.bms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bms.Dao.PerformTransactionDAO;
import com.bms.entity.TransactionDetails;
import com.bms.entity.UserDetails;
import com.bms.exceptions.TransactionTypeExceptions;
@Component
public class PerformTransactionService  {
	@Autowired
	PerformTransactionDAO performTransactionDao;
	public void addUserDetails(UserDetails userdetails) throws Exception {
		
		if(userdetails.getAcountNumber().toString().length()==16){
		System.out.println("in service");
		performTransactionDao.addUserDetails(userdetails);
		System.out.println("after service");
		}
		else{
			throw new Exception("Account Number Should Be Of 16 Digits");
		}
	}
	@Transactional
	public void updateTransactionDetails(TransactionDetails trans1, long accountNumber) throws TransactionTypeExceptions {
		// TODO Auto-generated method stub
//		for(TransactionDetails obj:userdetails)
		performTransactionDao.updateTransactionDetails(accountNumber);
		UserDetails usd=performTransactionDao.updateTransactionDetails(accountNumber);
		double transactionAmount=trans1.getAccountBalance();
		double accountBaance=usd.getAccountBalance();
		
		if(trans1.getTransactiontype().equals("deposit")){
			accountBaance=accountBaance+transactionAmount;
			usd.setAccountBalance(accountBaance);
			}
			else{
			accountBaance=accountBaance-transactionAmount;
			if(accountBaance<5000 && usd.getAccountType().equals("Savings")){
			throw new TransactionTypeExceptions("Saving Account's Balance can't be less than 5000");
			}
			else if(accountBaance<0){
			throw new TransactionTypeExceptions("Insufficient Balance");
			}
			else{
			usd.setAccountBalance(accountBaance);
			}
			}

		
		trans1.setUserdetails(usd);
		List<TransactionDetails> transactionList=new ArrayList<TransactionDetails>();
		System.out.println(trans1);
		transactionList.add(trans1);
		usd.setTransactionDetails(transactionList);
		System.out.println(usd);
		
		
		//usd.getAccountBalance()
		
	}
	public void retriveTransactionDetails(long accountNumber) {
		// TODO Auto-generated method stub
		performTransactionDao.retriveTransactionDetails(accountNumber);
	}
	
	

}
