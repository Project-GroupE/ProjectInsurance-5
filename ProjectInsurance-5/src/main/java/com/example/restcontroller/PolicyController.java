package com.example.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Policy;
import com.example.implementation.PolicyServiceImpl;




@RestController
@RequestMapping("/api/policies")
public class PolicyController {

	 @Autowired
	    private PolicyServiceImpl policyServiceImpl;

	    @GetMapping("/{driverName}")
	    public Optional<Policy> getPolicy(@PathVariable String driverName) {
	        return policyServiceImpl.getPolicyByDriverName(driverName);
	    }
}
