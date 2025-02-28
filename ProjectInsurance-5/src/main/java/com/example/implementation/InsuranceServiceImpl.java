package com.example.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Insurance;
import com.example.repository.InsuranceRepository;
import com.example.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	private InsuranceRepository insuranceRepository;

	@Override
	public Insurance saveInsurance(Insurance insurance) {
		Insurance insurance1 = insuranceRepository.save(insurance);
		return insurance1;
	}

}
