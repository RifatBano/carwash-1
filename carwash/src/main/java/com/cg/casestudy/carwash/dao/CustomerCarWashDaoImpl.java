package com.cg.casestudy.carwash.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.carwash.entity.Address;
import com.cg.casestudy.carwash.entity.CustomerRegistrationDetails;
import com.cg.casestudy.carwash.exception.CustomerCarWashException;

@Repository
public class CustomerCarWashDaoImpl implements CustomerCarWashDao{
	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public String saveCustomer(CustomerRegistrationDetails customer) throws CustomerCarWashException{
		// TODO Auto-generated method stub
		try {
			CustomerRegistrationDetails detailsExist=mongoTemplate.insert(customer,"CustomerRegister");
				if (detailsExist!= null) {
					return "registered successfully";
				}
			} catch (Exception e) {
				throw new CustomerCarWashException("repository error");
			}
			return "failed to add  details";
	}

	
	
	@Override
	public String findCustomer(CustomerRegistrationDetails customerdetails) throws CustomerCarWashException {
		// TODO Auto-generated method stub
		Query query = new Query();
		
		String customername = customerdetails.getCustomername();
		String password = customerdetails.getPassword(); 
		try {
			
			query = query.addCriteria(Criteria.where("customername").is(customername).andOperator(Criteria.where("password").is(password)));

			boolean CustomerExists = mongoTemplate.exists(query, "CustomerRegister");
			if (CustomerExists) {
				return "success";
			}
		} catch (Exception e) {
			throw new CustomerCarWashException("login error");
		}
		return "failed";

	}

	@Override
	public String saveAddress(Address address) throws CustomerCarWashException {
		// TODO Auto-generated method stub
		try {
           Address detailsExist=mongoTemplate.insert(address,"AddressDetails");
			if (detailsExist!= null) {
				return "details added";
			}
		} catch (Exception e) {
			throw new CustomerCarWashException("repository error");
		}
		return "failed to add Address details";

	}

	
}
