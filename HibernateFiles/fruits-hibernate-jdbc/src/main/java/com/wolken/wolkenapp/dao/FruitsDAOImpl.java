package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.diya.diyasapp.session_factory.HibernateUtil;
import com.wolken.wolkenapp.dto.FruitsDTO;


public class FruitsDAOImpl implements FruitsDAO{
	
	public void add(FruitsDTO fruitsDTO) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(fruitsDTO);
		transaction.commit();
		System.out.println("\nCommit executed !!\n"+fruitsDTO.getFruitName()+" added to database");
		
		session.close();
		
	}
		
	public void updateByID (FruitsDTO fruitsDTO) {
		
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		FruitsDTO updateDTO = session.get(FruitsDTO.class, fruitsDTO.getFruitID());
		
		updateDTO.setFruitName(fruitsDTO.getFruitName());
		updateDTO.setFruitColor(fruitsDTO.getFruitColor());
		updateDTO.setFruitPrice(fruitsDTO.getFruitPrice());
		
		session.update(updateDTO);
		transaction.commit();
		
		System.out.println("Updated record\n");
		System.out.println("\nFruit ID : "+updateDTO.getFruitID()+"\nFruit Name : "+updateDTO.getFruitName()+"\nFruit Colour : "+updateDTO.getFruitColor()+"\nFruit Price : "+updateDTO.getFruitPrice());
		
		session.close();
		
	}
	
	public void updateByName(String fruitName, String fruitColor, double fruitPrice) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update FruitsDTO fruitsDTO set fruitsDTO.fruitColor = '"+fruitColor+"', fruitsDTO.fruitPrice = "+fruitPrice+" where fruitsDTO.fruitName = '"+fruitName+"'");
		query.executeUpdate();
		
		transaction.commit();
		session.close();
		
	}
	
	public void updateByColor(String fruitColor, String fruitName, double fruitPrice) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		Query query = session.createQuery("update FruitsDTO fruitsDTO set fruitsDTO.fruitName = '"+fruitName+"', fruitsDTO.fruitPrice = "+fruitPrice+" where fruitsDTO.fruitColor = '"+fruitColor+"'");
		
		
		Query query = session.getNamedQuery("updateByColor");
		
		query.setParameter("name", fruitName);
		query.setParameter("color", fruitColor);
		query.setParameter("price", fruitPrice);
		query.executeUpdate();
		
		transaction.commit();
		session.close();
		
	}
	
	public void updateByPrice(double fruitPrice, String fruitName, String fruitColor) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		//using named parameter
		Query query = session.createQuery("update FruitsDTO fruitsDTO set fruitsDTO.fruitName =: name, fruitsDTO.fruitColor =: color where fruitsDTO.fruitPrice =: price");
		query.setParameter("name", fruitName);
		query.setParameter("color", fruitColor);
		query.setParameter("price", fruitPrice);
		query.executeUpdate();
		
		transaction.commit();
		session.close();
		
	}
	
	public List<FruitsDTO> displayAll() {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.getNamedQuery("selectAll");
		List<FruitsDTO> dispDTO = query.list();
		
		System.out.println(dispDTO);
		
		return dispDTO;
		
		
	}
	
	public void deleteByID(int fruitID) {
		
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		configuration.addAnnotatedClass(FruitsDTO.class);
//		
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		FruitsDTO deleteDTO = session.get(FruitsDTO.class, fruitID);
		
		session.delete(deleteDTO);
		transaction.commit();
		
		System.out.println("Updated record\n");
		System.out.println("\nFruit ID : "+deleteDTO.getFruitID()+"\nFruit Name : "+deleteDTO.getFruitName()+"\nFruit Colour : "+deleteDTO.getFruitColor()+"\nFruit Price : "+deleteDTO.getFruitPrice());
		
		session.close();
		
	}

}
