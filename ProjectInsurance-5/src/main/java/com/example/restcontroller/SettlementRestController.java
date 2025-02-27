package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Settlement;
import com.example.service.SettlementService;

@RestController
public class SettlementRestController {
	
	
	// inject user service here 
	@Autowired
	SettlementService settlementService;
	
	
	@PostMapping("/savePolicySettlement")
	public Settlement savePolicySettlement(@RequestBody Settlement settlement) {
		
		Settlement settlement1 = settlementService.saveSettlement(settlement);
		
		return settlement1;	
		
		
	}


}
