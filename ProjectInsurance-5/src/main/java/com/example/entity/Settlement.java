package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="settlement")
public class Settlement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer settlementId; // This is primary key of the settlement table
	 private String claimNumber;  // Reference number  add by siddhi
	 private double amount; // add by siddhi
	private double settledAmount;
	private String status;
	private String sttlementDate;
	private String paymentReference;
	
	@OneToOne(targetEntity = Policy.class, cascade = CascadeType.ALL) 
	private Policy policy;
	
	
	

	public Integer getSettlementId() {
		return settlementId;
	}

	 public String getClaimNumber() {      // add by siddhi
	        return claimNumber;
	    }

	    public void setClaimNumber(String claimNumber) {  // add by siddhi
	        this.claimNumber = claimNumber; 
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {  // add by siddhi
	        this.amount = amount;
	    }



	public void setSettlementId(Integer settlementId) {
		this.settlementId = settlementId;
	}




	public double getSettledAmount() {
		return settledAmount;
	}




	public void setSettledAmount(double settledAmount) {
		this.settledAmount = settledAmount;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getSttlementDate() {
		return sttlementDate;
	}




	public void setSttlementDate(String sttlementDate) {
		this.sttlementDate = sttlementDate;
	}




	public String getPaymentReference() {
		return paymentReference;
	}




	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}




	public Policy getPolicy() {
		return policy;
	}




	public void setPolicy(Policy policy) {
		this.policy = policy;
	}




	@Override
	public String toString() {
		return "Settlement [settlementId=" + settlementId + ", settledAmount=" + settledAmount + ", status=" + status
				+ ", sttlementDate=" + sttlementDate + ", paymentReference=" + paymentReference + ", policy=" + policy
				+ "]";
	} 
	
	
	
	

}
