
package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.LoginEntity;

@Component
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	LocalSessionFactoryBean bean;
	
	public LoginEntity loginUser(String studUSN) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from LoginEntity ent where ent.studUSN =: usn").setParameter("usn", studUSN);
		LoginEntity le = (LoginEntity) query.setMaxResults(1).uniqueResult();
		
		transaction.commit();
		session.close();
		
		return le;
	}
}
