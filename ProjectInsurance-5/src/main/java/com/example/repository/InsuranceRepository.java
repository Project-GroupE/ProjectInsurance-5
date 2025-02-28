package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

}
