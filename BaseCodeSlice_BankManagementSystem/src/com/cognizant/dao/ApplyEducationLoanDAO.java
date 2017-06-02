package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.ApplyEducationLoan;
import com.cognizant.entity.UserDetails;

@Component
public class ApplyEducationLoanDAO {
	 @PersistenceContext
	    private EntityManager em;

	    @Transactional
	public void insertLoan(ApplyEducationLoan loanObj) {
	    	em.persist(loanObj);
		
	}
	   

	   
		public void addUser(UserDetails userDetails) {
	    	em.persist(userDetails);
		}
	   
		public UserDetails insertEducationLoan(long accountNumber) {
			
			UserDetails usd=em.find(UserDetails.class,accountNumber);
			return usd;
			
			
		}

}
