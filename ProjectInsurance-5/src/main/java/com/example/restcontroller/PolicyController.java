package com.example.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Policy;
import com.example.entity.User;
import com.example.service.PolicyService;
import com.example.service.UserService;




@RestController
@RequestMapping("/api/policies")
public class PolicyController {

	@Autowired
	private PolicyService policyService;
	
	@Autowired
	private UserService userService;

	@GetMapping("/{driverName}")
	public Optional<Policy> getPolicy(@PathVariable String driverName) {
		return policyService.getPolicyByDriverName(driverName);
	}

	@PostMapping("/saveUserPolicy")
	public User saveUser(@RequestBody User user) {

		User u2=userService.saveUser(user);

		List<Policy> p1=user.getPolicyList();

		for (Policy policy : p1) {
			policy.setId(user.getId());
			policyService.savePolicy(policy);
		}

		return u2;
	}
}
