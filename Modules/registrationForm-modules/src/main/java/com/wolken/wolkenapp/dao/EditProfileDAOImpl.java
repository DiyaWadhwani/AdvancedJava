package com.wolken.wolkenapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.entity.EditProfileEntity;

@Component
public class EditProfileDAOImpl implements EditProfileDAO {
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	public EditProfileEntity getStudDetailsByEmail (String studEmail) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from EditProfileEntity epe where epe.studEmail =: email").setParameter("email", studEmail);
		EditProfileEntity editProfileEntity = (EditProfileEntity) query.setMaxResults(1).uniqueResult();
		
		transaction.commit();
		session.close();
		
		return editProfileEntity;
	}
	
	public int updateStudDetails (EditProfileEntity editProfileEntity) {
		
		SessionFactory sessionFactory = bean.getObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update EditProfileEntity epe set epe.studName =: name, epe.studEmail =: email, epe.studGPA =: gpa, epe.studBacks =: backs where epe.studEmail =: email");
		query.setParameter("name", editProfileEntity.getStudName());
		query.setParameter("email", editProfileEntity.getStudEmail());
		query.setParameter("gpa", editProfileEntity.getStudGPA());
		query.setParameter("backs", editProfileEntity.getStudBacks());
		query.setParameter("email", editProfileEntity.getStudEmail());
		
		int rows = query.executeUpdate();
		
		transaction.commit();
		session.close();
		
		return rows;
	}

}
