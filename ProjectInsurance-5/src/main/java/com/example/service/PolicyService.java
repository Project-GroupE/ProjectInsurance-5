package com.example.service;

import java.util.Optional;

import com.example.entity.Policy;



public interface PolicyService 
{
	public Policy savePolicy(Policy policy);
	
	public Optional<Policy> getPolicyByDriverName(String driverName);
	
}