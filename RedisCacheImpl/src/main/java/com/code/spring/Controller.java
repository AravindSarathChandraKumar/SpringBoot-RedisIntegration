package com.code.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private DetailsService detailsService;

	@RequestMapping(value = "/details/{code}/{name}/{type}/{state}", method = RequestMethod.GET)
	public List<DataDetails> getDetails(@PathVariable String code,@PathVariable(required=false) String name,
			@PathVariable(required=false) String type,@PathVariable(required=false) String state) {
		Request req= new Request();
		req.setCode(code);
		req.setName(name);
		req.setState(state);
		req.setType(type);
		if(name.equalsIgnoreCase("default")) {
		return detailsService.getData(req,Identifiers.CLAIM);
		}else {
			return detailsService.getData(req,Identifiers.PRECLAIM);
		}
		
	}

}
