package com.pmobile.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmobile.tutorial.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{
	
	
}