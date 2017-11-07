package com.cg.complaint.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;








import com.cg.complaint.model.ComplaintDetails;

@Repository
@Transactional
public class ComplaintDaoImpl implements IComplaintDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addComplaint(ComplaintDetails complaint) {

	/*	Query query=em.createNamedQuery("addComplaint");
		query.executeUpdate();
		em.flush();*/
		
		em.persist(complaint);
		em.flush();
	}

	@Override
	public ComplaintDetails getStatusById(int id) {
		
		System.out.println(id);
		//Query q=em.createNamedQuery("getStatusById");
		ComplaintDetails c=em.find(ComplaintDetails.class, id);
		System.out.println(c);
		return c;
	}

	@Override
	public List<String> getAllPrior() {
		Query q=em.createNamedQuery("getAllPrior");
		@SuppressWarnings("unchecked")
		List<String> li=q.getResultList();
		System.out.println(li);
		return li;
	}

}
