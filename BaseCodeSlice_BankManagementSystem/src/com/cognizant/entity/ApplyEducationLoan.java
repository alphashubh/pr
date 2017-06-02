package com.cognizant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import com.sun.istack.internal.NotNull;
@Entity
public class ApplyEducationLoan {
	
	@Column(name="Education_Loan_Id")
    String educationLoanId;
	/*@Column(name="Account_Number")
	long accountNumber;*/
	@Id
	@Column(name="Edu_loan_Account_Number")
	long eduLoanAccountNumber;
	@Column(name="Edu_Loan_Amount")
	double eduLoanAmount;
	@Column(name="Edu_Loan_Apply_Date")
	String eduLoanApplyDate;
	@Column(name="Edu_Loan_Duration")
	int eduLoanDuration;
	@Column(name="Father_Annual_Income")
	double fatherAnnualIncome;
	@Column(name="Course_Fee")
	double courseFee;
	@Column(name="Course_Name")
	String courseName;
	@Column(name="Father_Name")
	String fatherName;
	@Column(name="ID_Card_Number")
	long idCardNumber;
	
@ManyToOne(cascade= CascadeType.ALL)
@JoinColumn(name="Account_Number")
private UserDetails userDetails;
public ApplyEducationLoan(){
	
}




public ApplyEducationLoan(String educationLoanId, long eduLoanAccountNumber, double eduLoanAmount,
		String eduLoanApplyDate, int eduLoanDuration, double fatherAnnualIncome, double courseFee, String courseName,
		String fatherName, long idCardNumber, UserDetails userDetails) {
	super();
	this.educationLoanId = educationLoanId;
	this.eduLoanAccountNumber = eduLoanAccountNumber;
	this.eduLoanAmount = eduLoanAmount;
	this.eduLoanApplyDate = eduLoanApplyDate;
	this.eduLoanDuration = eduLoanDuration;
	this.fatherAnnualIncome = fatherAnnualIncome;
	this.courseFee = courseFee;
	this.courseName = courseName;
	this.fatherName = fatherName;
	this.idCardNumber = idCardNumber;
	this.userDetails = userDetails;
}




public ApplyEducationLoan(String educationLoanId, long eduLoanAccountNumber, double eduLoanAmount,
		String eduLoanApplyDate, int eduLoanDuration, double fatherAnnualIncome, double courseFee, String courseName,
		String fatherName, long idCardNumber) {
	super();
	this.educationLoanId = educationLoanId;
	this.eduLoanAccountNumber = eduLoanAccountNumber;
	this.eduLoanAmount = eduLoanAmount;
	this.eduLoanApplyDate = eduLoanApplyDate;
	this.eduLoanDuration = eduLoanDuration;
	this.fatherAnnualIncome = fatherAnnualIncome;
	this.courseFee = courseFee;
	this.courseName = courseName;
	this.fatherName = fatherName;
	this.idCardNumber = idCardNumber;
}




public String getEducationLoanId() {
	return educationLoanId;
}

public void setEducationLoanId(String educationLoanId) {
	this.educationLoanId = educationLoanId;
}

public long getEduLoanAccountNumber() {
	return eduLoanAccountNumber;
}

public ApplyEducationLoan(double eduLoanAmount, String eduLoanApplyDate, int eduLoanDuration, double fatherAnnualIncome,
		double courseFee, String courseName, String fatherName, long idCardNumber) {
	super();
	this.eduLoanAmount = eduLoanAmount;
	this.eduLoanApplyDate = eduLoanApplyDate;
	this.eduLoanDuration = eduLoanDuration;
	this.fatherAnnualIncome = fatherAnnualIncome;
	this.courseFee = courseFee;
	this.courseName = courseName;
	this.fatherName = fatherName;
	this.idCardNumber = idCardNumber;
}
public void setEduLoanAccountNumber(long eduLoanAccountNumber) {
	this.eduLoanAccountNumber = eduLoanAccountNumber;
}

public double getEduLoanAmount() {
	return eduLoanAmount;
}

public void setEduLoanAmount(double eduLoanAmount) {
	this.eduLoanAmount = eduLoanAmount;
}

public String getEduLoanApplyDate() {
	return eduLoanApplyDate;
}

public void setEduLoanApplyDate(String eduLoanApplyDate) {
	this.eduLoanApplyDate = eduLoanApplyDate;
}

public int getEduLoanDuration() {
	return eduLoanDuration;
}

public void setEduLoanDuration(int eduLoanDuration) {
	this.eduLoanDuration = eduLoanDuration;
}

public double getFatherAnnualIncome() {
	return fatherAnnualIncome;
}

public void setFatherAnnualIncome(double fatherAnnualIncome) {
	this.fatherAnnualIncome = fatherAnnualIncome;
}

public double getCourseFee() {
	return courseFee;
}

public void setCourseFee(double courseFee) {
	this.courseFee = courseFee;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String getFatherName() {
	return fatherName;
}

public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

public long getIdCardNumber() {
	return idCardNumber;
}

public void setIdCardNumber(long idCardNumber) {
	this.idCardNumber = idCardNumber;
}

public UserDetails getUserDetails() {
	return userDetails;
}

public void setUser(UserDetails userDetails) {
	this.userDetails = userDetails;
}




@Override
public String toString() {
	return "ApplyEducationLoan [educationLoanId=" + educationLoanId + ", eduLoanAccountNumber=" + eduLoanAccountNumber
			+ ", eduLoanAmount=" + eduLoanAmount + ", eduLoanApplyDate=" + eduLoanApplyDate + ", eduLoanDuration="
			+ eduLoanDuration + ", fatherAnnualIncome=" + fatherAnnualIncome + ", courseFee=" + courseFee
			+ ", courseName=" + courseName + ", fatherName=" + fatherName + ", idCardNumber=" + idCardNumber + "]";
}



	
}
