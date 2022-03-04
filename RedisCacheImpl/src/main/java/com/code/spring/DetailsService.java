package com.code.spring;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class DetailsService {

	Logger logger = LoggerFactory.getLogger(DetailsService.class);
	
	@Cacheable(value="data", key="{#req.code:#type}")
	public List<DataDetails> getData(Request req,Identifiers type){
		logger.debug("<<<<<<<<<Method ExecutionBegin>>>>>>>>>>>>>");
		DataDetails dataDetails = new DataDetails();
		List<DataDetails> list = new ArrayList<>();
		Collision collision = new Collision();
		Exposure exposure = new Exposure();
		dataDetails.setCode("134");
		dataDetails.setName("Data1");
		collision.setCollisionCode("987654");
		collision.setPublicCode("$%^&$#$%^#%&&%");
		exposure.setExposureCode("#$%^&^%#$%*&^$@$@#%@$%$%");
		exposure.setExposureId("19876567898765789876567890");
		collision.setExposureDetails(exposure);
		dataDetails.setCollisionDetails(collision);
		list.add(dataDetails);
		DataDetails dataDetails1 = new DataDetails();
		Collision collision1 = new Collision();
		Exposure exposure1 = new Exposure();
		dataDetails1.setCode("134");
		dataDetails1.setName("Data1");
		collision1.setCollisionCode("987654");
		collision1.setPublicCode("$%^&$#$%^#%&&%");
		exposure1.setExposureCode("#$%^&^%#$%*&^$@$@#%@$%$%");
		exposure1.setExposureId("19876567898765789876567890");
		collision1.setExposureDetails(exposure);
		dataDetails1.setCollisionDetails(collision);
		list.add(dataDetails1);
		System.out.println("Method Executed..........");
		return list;
		
 		
	}

}
