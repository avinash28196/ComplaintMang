package com.cg.emp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.emp.dto.DetailsBean;

@Repository
@Transactional
public class EmpDAOImpl implements IEmpDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public DetailsBean addDetails(DetailsBean cust) {
		entityManager.persist(cust);
		entityManager.flush();
		
		return cust;
	}


	@Override
	public List<DetailsBean> displayAll() {
			TypedQuery<DetailsBean> query = entityManager.createNamedQuery("getAll", DetailsBean.class);
			List<DetailsBean> list = query.getResultList();
			return list;
		
	}
}