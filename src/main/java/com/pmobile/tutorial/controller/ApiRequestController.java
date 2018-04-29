package com.pmobile.tutorial.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmobile.tutorial.model.ApiRequest;
import com.pmobile.tutorial.service.ApiRequestService;

@RestController
//@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);

    @GetMapping(value = "/")
    public Map<String, String> getHome() {
        logger.info("Api request received");

        Map<String, String> response = new HashMap<String, String>();
        try {
            ApiRequest apiRequest = new ApiRequest(new Date());
            apiRequestService.create(apiRequest);
            response.put("status", "success");
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }
}
