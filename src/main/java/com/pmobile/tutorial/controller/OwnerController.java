package com.pmobile.tutorial.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmobile.tutorial.dto.OwnerDto;
import com.pmobile.tutorial.model.Owner;
import com.pmobile.tutorial.service.OwnerService;

@RestController()
@RequestMapping("owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	private static final Logger logger = LoggerFactory.getLogger(OwnerController.class);

	@GetMapping(value = "/list")
	public List<Owner> getOwners() {
		return ownerService.listOwners();
	}

	@GetMapping(value = "/listCorrect")
	public List<OwnerDto> getOwnersCorrect() {
		return ownerService.listOwnersCorrect();
	}

	@GetMapping(value = "/add")
	public List<OwnerDto> addOwner() {
		ownerService.saveSampleOwner();
		logger.info("new owner added");	
		return ownerService.listOwnersCorrect();
	}

}
