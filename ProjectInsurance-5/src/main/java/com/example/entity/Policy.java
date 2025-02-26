package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="policies")
public class Policy {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer policyId;
private String policyName;
private String policyNumber;
private String policyStatus;
private String plHolderName;
private double policyAmt;
private String driverName;
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}
public Integer getPolicyId() {
	return policyId;
}
public void setPolicyId(Integer policyId) {
	this.policyId = policyId;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public String getPolicyNumber() {
	return policyNumber;
}
public void setPolicyNumber(String policyNumber) {
	this.policyNumber = policyNumber;
}
public String getPolicyStatus() {
	return policyStatus;
}
public void setPolicyStatus(String policyStatus) {
	this.policyStatus = policyStatus;
}
public String getPlHolderName() {
	return plHolderName;
}
public void setPlHolderName(String plHolderName) {
	this.plHolderName = plHolderName;
}
public double getPolicyAmt() {
	return policyAmt;
}
public void setPolicyAmt(double policyAmt) {
	this.policyAmt = policyAmt;
}
@Override
public String toString() {
	return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyNumber=" + policyNumber
			+ ", policyStatus=" + policyStatus + ", plHolderName=" + plHolderName + ", policyAmt=" + policyAmt
			+ ", driverName=" + driverName + "]";
}

}
