package com.pmobile.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.pmobile.tutorial.model.ApiRequest;

public interface ApiRequestDao extends CrudRepository<ApiRequest, Long>{
	
	
}