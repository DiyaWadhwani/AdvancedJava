package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.SubjectsDTO;
import com.wolken.wolkenapp.entity.SubjectsEntity;

@Component
public class SubjectDAOImpl implements SubjectDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	Logger logger = Logger.getLogger(SubjectsDTO.class);
	
	public void addSubject (SubjectsEntity subjectsEntity) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(subjectsEntity);
		
		logger.info("New subject added");
		
		transaction.commit();
		session.close();
	}
	
	public List <SubjectsEntity> getSubDetailsByType (String subType) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from SubjectsEntity se where se.subType =: type").setParameter("type", subType);
		
		List <SubjectsEntity> subjectList = query.list();
		
		logger.info("Fetched Details by Type");
		
		return subjectList;
	}

}
