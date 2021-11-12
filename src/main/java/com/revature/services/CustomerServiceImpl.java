package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Customer;
import com.revature.repositories.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo cr;
	
	@Override
	public Customer getCustomer(int id) {
		return cr.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) cr.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return cr.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return cr.save(customer);
	}

	@Override
	public boolean deleteCustomer(int id) {
		
		try{
            cr.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	

}
