
package com.cognizant.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.cognizant.entity.UserDetails;

@Entity
@Table(name="Home_Loan_Details")
public class ApplyHomeLoan {

	
	@Column(name="HOME_LOAN_ID")
	String homeLoanId;
	
	@Range(min=1,max=999999999999999l , message="Please enter valid amount.")
	
	@Column(name="LOAN_AMOUNT",nullable = false, columnDefinition = "long default 0") 
	@NumberFormat(style = Style.NUMBER)
	long loanAmount;
	
	
	@Column(name="LOAN_DURATION")
	 int loanDuration;
	 
	@Column(name="LOAN_APPLY_DATE")
	Date loanApplyDate;
	
	@Range(min=1,max=999999999999999l , message="Please enter valid income.")
	@Column(name="ANNUAL_INCOME",nullable = false, columnDefinition = "long default 0")
	 long annualIncome;
	
	@NotEmpty(message="Company name should not be empty")
	@Pattern(regexp="^[a-zA-Z]*$", message = "Only Alphabets are allowed.")
	@Column(name="COMPANY_NAME")
	 String companyName;
	
	@NotEmpty(message="Designation can not be empty.")
	@Pattern(regexp="^[a-zA-Z]*$", message = "Only Alphabets are allowed.")
	@Column(name="DESIGNATON")
	 String designation;
	
	@Range(min=1,max=80, message="Please enter valid experience years.")
	//@Pattern(regexp="^[0-9]*$", message = "Only numerics are allowed.")
	@Column(name="TOTAL_EXP")
	 int totalExperience;
	
	@Range(min=1,max=80, message="Please enter valid experience years.")
	@Column(name="CURRENT_EXP")
	 int currentExperience;
	 
	 @Id
	 @Column(name="LOAN_ACCOUNT_NUMBER")
	 long loanAccountNumber;

	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}


	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name = "ACCOUNT_NUMBER")
		private UserDetails userDetails;
	 
	 public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}



	 
	public String getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(String homeLoanId) {
		this.homeLoanId = homeLoanId;
	}

	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public int getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}
	@Override
	public String toString() {
		return "HomeLoan [homeLoanId=" + homeLoanId + ", loanAmount=" + loanAmount + ", loanDuration=" + loanDuration
				+ ", loanApplyDate=" + loanApplyDate + ", annualIncome="
				+ annualIncome + ", companyName=" + companyName + ", designation=" + designation + ", totalExperience="
				+ totalExperience + ", currentExperience=" + currentExperience + "]";
	}
	public ApplyHomeLoan( long loanAmount, int loanDuration,
			long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,UserDetails userDetails) {
		super();
	
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		//this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		this.userDetails=userDetails;
	}
	
	  
	public ApplyHomeLoan(){}	


public ApplyHomeLoan( long loanAmount, int loanDuration, 
		long annualIncome, String companyName, String designation, int totalExperience, int currentExperience) {
	super();

	this.loanAmount = loanAmount;
	this.loanDuration = loanDuration;
	//this.loanApplyDate = loanApplyDate;
	this.annualIncome = annualIncome;
	this.companyName = companyName;
	this.designation = designation;
	this.totalExperience = totalExperience;
	this.currentExperience = currentExperience;
	//this.userDtails=userDetails;
}

public ApplyHomeLoan( String homeLoanId,long loanAccountNumber,long loanAmount, int loanDuration, Date loanApplyDate,
		long annualIncome, String companyName, String designation, int totalExperience, int currentExperience) {
	super();
	this.homeLoanId=homeLoanId;
	this.loanAccountNumber=loanAccountNumber;
	this.loanAmount = loanAmount;
	this.loanDuration = loanDuration;
	this.loanApplyDate = loanApplyDate;
	this.annualIncome = annualIncome;
	this.companyName = companyName;
	this.designation = designation;
	this.totalExperience = totalExperience;
	this.currentExperience = currentExperience;
	//this.userDtails=userDetails;
}

}