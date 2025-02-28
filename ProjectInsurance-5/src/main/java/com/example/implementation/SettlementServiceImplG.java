package com.example.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Settlement;
import com.example.repository.SettlementRepositoryG;
import com.example.service.SettlementServiceG;
import java.util.List;
import java.util.Optional;

@Service
public class SettlementServiceImplG implements SettlementServiceG {

    @Autowired
    private SettlementRepositoryG settlementRepositoryG;

    @Override
    public Settlement getSettlementById(Integer id) {
        Optional<Settlement> settlement = settlementRepositoryG.findById(id);
        return settlement.orElse(null); // Returns null if not found
    }

    @Override
    public List<Settlement> getAllSettlements() {
        return settlementRepositoryG.findAll();
    }
}
