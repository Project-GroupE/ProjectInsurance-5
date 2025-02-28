package com.example.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Settlement;
import com.example.repository.SettlementRepository;
import com.example.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService{
	
	
	@Autowired
	SettlementRepository settlementRepository;

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		Settlement settlement1 = settlementRepository.save(settlement);
		return settlement1;
	}

}
