package com.example.bank.model;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.bank.model.AnalyticsOfStatements;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "accountStatement")
public class AccountStatement {

	@XmlElement
	private Date fromDate;
	
	@XmlElement
	private Date toDate;
	
	@XmlElement
	private String accountNumber;
	
	@XmlElement
	private Float startAccountState;
	
	@XmlElement
	private Float trafficToBenefit;
	
	@XmlElement
	private int countOfTrafficToBenefit;
	
	@XmlElement
	private Float trafficToTheBurden; //promet na teret
	
	@XmlElement
	private int countOfTrafficToBurden;
	
	@XmlElement
	private Float stateAtTheEndOfPeriod;
	
	@XmlElement
	private ArrayList<AnalyticsOfStatements>statements;




	public ArrayList<AnalyticsOfStatements> getStatements() {
		return statements;
	}


	public void setStatements(ArrayList<AnalyticsOfStatements> statements) {
		this.statements = statements;
	}


	public Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	public Date getToDate() {
		return toDate;
	}


	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}


	public Float getStartAccountState() {
		return startAccountState;
	}


	public void setStartAccountState(Float startAccountState) {
		this.startAccountState = startAccountState;
	}


	public Float getTrafficToBenefit() {
		return trafficToBenefit;
	}


	public void setTrafficToBenefit(Float trafficToBenefit) {
		this.trafficToBenefit = trafficToBenefit;
	}


	public Float getTrafficToTheBurden() {
		return trafficToTheBurden;
	}


	public void setTrafficToTheBurden(Float trafficToTheBurden) {
		this.trafficToTheBurden = trafficToTheBurden;
	}


	public Float getStateAtTheEndOfPeriod() {
		return stateAtTheEndOfPeriod;
	}


	public void setStateAtTheEndOfPeriod(Float stateAtTheEndOfPeriod) {
		this.stateAtTheEndOfPeriod = stateAtTheEndOfPeriod;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	
	
	
}
