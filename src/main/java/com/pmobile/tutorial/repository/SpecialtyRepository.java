package com.pmobile.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmobile.tutorial.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long>{
	
	
}