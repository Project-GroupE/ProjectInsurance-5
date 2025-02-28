package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement, Integer> {

}
