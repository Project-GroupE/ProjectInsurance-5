package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Insurance;
import com.example.service.InsuranceService;

@RestController
public class InsuranceRestController {
	@Autowired
	private InsuranceService insuranceService;

	@PostMapping("/saveInsuranceDetails")
	public Insurance saveInsuranceDetails(@RequestBody Insurance insurance) {
		Insurance savedInsurance = insuranceService.saveInsurance(insurance);
		return savedInsurance;
	}

}
