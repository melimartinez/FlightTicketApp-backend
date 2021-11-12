package com.revature.services;

import java.util.List;

import com.revature.models.Customer;

public interface CustomerService {
	
	public Customer getCustomer(int id);
    public List<Customer> getAllCustomers();
    public Customer addCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public boolean deleteCustomer(int id);
    
}
