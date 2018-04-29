package com.pmobile.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmobile.tutorial.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{
	
	
}