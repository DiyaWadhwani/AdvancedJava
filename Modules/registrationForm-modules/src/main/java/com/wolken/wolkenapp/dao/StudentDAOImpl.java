package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.StudentEntity;

@Component
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	public void newRegistration(StudentEntity studentEntity) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(studentEntity);
		transaction.commit();
		session.close();
	}
	
	public StudentEntity getStudentByName(String studName) {
				
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from StudentEntity ent where ent.studName =: name").setParameter("name", studName);
		
		StudentEntity ent = (StudentEntity) query.setMaxResults(1).uniqueResult();
		
		transaction.commit();
		session.close();
		
		return ent;		
	}
		
}
