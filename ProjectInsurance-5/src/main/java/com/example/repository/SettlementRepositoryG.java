package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Settlement;
import java.util.List;

public interface SettlementRepositoryG extends JpaRepository<Settlement, Integer> {
    List<Settlement> findAll();
}
