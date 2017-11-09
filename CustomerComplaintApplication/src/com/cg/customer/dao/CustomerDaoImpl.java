package com.cg.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.customer.model.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer addDetails(Customer bean) {
		// TODO Auto-generated method stub
		entityManager.persist(bean);
		entityManager.flush();
		
		return bean;
	}

	@Override
	public Customer getDetails(int complaintId) {
		// TODO Auto-generated method stub
		
		TypedQuery<Customer> query = entityManager.createNamedQuery("getCustomerDetails", Customer.class).setParameter("cId", complaintId);
		Customer customer = (Customer) query.getSingleResult();

		return customer;
		
	}

}
