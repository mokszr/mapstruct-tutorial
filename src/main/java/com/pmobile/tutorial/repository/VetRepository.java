package com.pmobile.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmobile.tutorial.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long>{
	
	
}