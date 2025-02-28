package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	private String userName;
	private String userEmail;
	private Long userPhone;
	private String userAddress;
	
	@OneToMany( mappedBy = "policyId" )
	private List<Policy> policyList;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public List<Policy> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhone=" + userPhone
				+ ", userAddress=" + userAddress + ", policyList=" + policyList + "]";
	}
	
}
