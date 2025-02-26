package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Policy;



public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	Optional<Policy> findByDriverName(String driverName);
}
