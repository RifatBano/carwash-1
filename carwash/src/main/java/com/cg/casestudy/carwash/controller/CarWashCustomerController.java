package com.cg.casestudy.carwash.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.entity.Address;
import com.cg.casestudy.carwash.entity.CustomerRegistrationDetails;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;
import com.cg.casestudy.carwash.service.CustomerCarWashService;


@RestController
@RequestMapping(value="/customer")
public class CarWashCustomerController {

	private final Logger LOG = LoggerFactory.getLogger(CarWashCustomerController.class);
	
	@Autowired
	public CustomerCarWashService customerCarWashService;
	
	String message=null;

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/json", produces = "text/plain")
    public String customerRegistration(@RequestBody CustomerRegistrationDetails customer) throws CustomerCarWashException
	{
		try {
			message=customerCarWashService.registerCustomer(customer);
		} catch (Exception e) {
			throw new CustomerCarWashException("Error Occurred");
		}
		return message;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "text/plain")
	public String checkCustomerLogin(@RequestBody CustomerRegistrationDetails customer) throws CustomerCarWashException {		
		//LOG.info("Getting all users");
		System.out.println("hiiiiii");
      
	try {
		LOG.info("stated login service");
		message=customerCarWashService.login(customer);
	} catch (Exception e) {
		throw new CustomerCarWashException("Error Occurred");
	}
	return message;
}
	
	//@PostMapping("/details")
	@RequestMapping(value = "/details", method = RequestMethod.POST, consumes = "application/json", produces = "text/plain")
	public String addDetails(@RequestBody Address address)throws CustomerCarWashException 
	{
		try {
			message=customerCarWashService.addressDetails(address);
		} catch (Exception e) {
			throw new CustomerCarWashException("Error Occurred");
		}
		return message;
		
	}
	
	
	
}
