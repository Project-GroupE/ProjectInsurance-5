package com.example.service;

import java.util.Optional;

import com.example.entity.Policy;



public interface PolicyService 
{
	public Optional<Policy> getPolicyByDriverName(String driverName);
}