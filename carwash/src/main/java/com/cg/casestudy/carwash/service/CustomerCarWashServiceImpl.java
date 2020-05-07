/**
 * 
 */
package com.cg.casestudy.carwash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.dao.CustomerCarWashDao;
import com.cg.casestudy.carwash.entity.Address;
import com.cg.casestudy.carwash.entity.CustomerRegistrationDetails;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;


@Service
public class CustomerCarWashServiceImpl implements CustomerCarWashService{

	@Autowired
	private CustomerCarWashDao customerCarWashDao;

	public void setDao(CustomerCarWashDao customerCarWashDao) {
		this.customerCarWashDao = customerCarWashDao;
	}

	@Override
	public String registerCustomer(CustomerRegistrationDetails customer) throws CustomerCarWashException {
		// TODO Auto-generated method stub
		String result = customerCarWashDao.saveCustomer(customer);
		if (result==null) {
			throw new CustomerCarWashException("error");
		}
		return result;
	}
	
	@Override
	public String login(CustomerRegistrationDetails customerDetails) throws CustomerCarWashException {

		String result = customerCarWashDao.findCustomer(customerDetails);
		if (result==null) {
			throw new CustomerCarWashException("error");
		}
		return result;

	}

	@Override
	public String addressDetails(Address address) throws CustomerCarWashException {
		// TODO Auto-generated method stub
		String result = customerCarWashDao.saveAddress(address);
		if (result==null) {
			throw new CustomerCarWashException("error");
		}
		return result;
	}

	
}
