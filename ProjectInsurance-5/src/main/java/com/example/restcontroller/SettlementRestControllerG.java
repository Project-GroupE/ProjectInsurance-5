package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.entity.Settlement;
import com.example.service.SettlementServiceG;
import java.util.List;

@RestController
@RequestMapping("/api/settlementsG")
public class SettlementRestControllerG {

    @Autowired
    private SettlementServiceG settlementServiceG;

    // Get a specific settlement by ID
    @GetMapping("/{id}")
    public Settlement getSettlementById(@PathVariable Integer id) {
        return settlementServiceG.getSettlementById(id);
    }

    // Get all settlements
    @GetMapping
    public List<Settlement> getAllSettlements() {
        return settlementServiceG.getAllSettlements();
    }
}
