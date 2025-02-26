package com.example.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Policy;
import com.example.repository.PolicyRepository;
import com.example.service.PolicyService;

/*import com.policy.Repository.PolicyRepository;
import com.policy.Service.PolicyService;
import com.policy.entity.Policy;*/

@Service
public class PolicyServiceImpl implements PolicyService{
	 @Autowired
	    private PolicyRepository policyRepository;
	 	
	 @Override
	    public Optional<Policy> getPolicyByDriverName(String driverName) {
	        return policyRepository.findByDriverName(driverName);
	    }
}
