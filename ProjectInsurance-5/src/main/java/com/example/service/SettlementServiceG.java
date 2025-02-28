package com.example.service;

import com.example.entity.Settlement;
import java.util.List;

public interface SettlementServiceG {
    Settlement getSettlementById(Integer id);
    List<Settlement> getAllSettlements();
}
