package com.pmobile.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmobile.tutorial.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{
	
	
}