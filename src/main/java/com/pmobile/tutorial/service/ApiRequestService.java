package com.pmobile.tutorial.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmobile.tutorial.model.ApiRequest;
import com.pmobile.tutorial.repository.ApiRequestDao;

@Transactional
@Service
public class ApiRequestService {

	@Autowired
	private ApiRequestDao apiRequestDao;

	public void create(ApiRequest apiRequest) {
		apiRequestDao.save(apiRequest);
	}
}
