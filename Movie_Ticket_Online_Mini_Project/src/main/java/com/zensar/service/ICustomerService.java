package com.zensar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Customer;
import com.zensar.db.ICustomerDAO;

@Service
public class ICustomerService {

	@Autowired
	ICustomerDAO customerDao;

	// ADD SERVICE
	public Customer addCustomer(Customer customer) {
		return this.customerDao.save(customer);
	}

	// UPDATE SERVICE
	public Customer updateCustomer(Customer customer) {
		return this.customerDao.save(customer);
	}

	// DELETE SERVICE
	public boolean deleteCustomer(Customer customer) {
		customerDao.delete(customer);
		return true;
	}

	// GET SERVICES
	public Customer viewCustomer(int customerId) {
		return this.customerDao.findById(customerId).get();
	}

	public List<Customer> viewAllCustomers(int movieId) {
		return this.customerDao.findAll();
	}

}