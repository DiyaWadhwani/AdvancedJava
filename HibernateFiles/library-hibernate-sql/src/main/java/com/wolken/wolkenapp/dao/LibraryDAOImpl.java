package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.diya.diyasapp.session_factory.HibernateUtil;
import com.sun.istack.logging.Logger;
import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

public class LibraryDAOImpl implements LibraryDAO {
	
	Logger logger = Logger.getLogger(LibraryServiceImpl.class);
	
	public void insertBook(LibraryDTO libraryDTO) {
		
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		configuration.addAnnotatedClass(LibraryDTO.class);
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(libraryDTO);
		transaction.commit();
		
		logger.info("\nCommit executed !!");
		
		System.out.println("\n"+libraryDTO.getBookName()+" added to database");
		
		session.close();
	}
	
	public List<LibraryDTO> displayBooks() {
		
//		Configuration configuration = new Configuration();
//		configuration.configure();
//		configuration.addAnnotatedClass(LibraryDTO.class);
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.getNamedQuery("selectAll");
//		Query query = session.createQuery("from LibraryDTO libraryDTO");
		List<LibraryDTO> booksList = query.list();
		
		logger.info("\nDatabase Fetched");
		
		System.out.println(booksList);
		
		return booksList;
		
	}
	
	public void updateBookByID(LibraryDTO libraryDTO) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
//		Query query = session.createQuery("update LibraryDTO libraryDTO set libraryDTO.bookName =: name, libraryDTO.bookPages =: pages, libraryDTO.bookPrice =: price where libraryDTO.bookID =: id");
//		query.setParameter("name", libraryDTO.getBookName());
//		query.setParameter("pages", libraryDTO.getBookPages());
//		query.setParameter("price", libraryDTO.getBookPrice());
//		query.setParameter("id", libraryDTO.getBookID());
		
		LibraryDTO updateDTO = session.get(LibraryDTO.class, libraryDTO.getBookID());
		
		updateDTO.setBookName(libraryDTO.getBookName());
		updateDTO.setBookPages(libraryDTO.getBookPages());
		updateDTO.setBookPrice(libraryDTO.getBookPrice());
		
		session.save(updateDTO);
		transaction.commit();
		
		logger.info("\nUpdated record");
		System.out.println("\nBook ID : "+updateDTO.getBookID()+"\nBook Name : "+updateDTO.getBookName()+"\nNo. of Pages : "+updateDTO.getBookPages()+"\nBook Price : "+updateDTO.getBookPrice());
		
		session.close();
		
	}
	
	public void updateBookByName(String bookName, int bookPages, double bookPrice) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("update LibraryDTO libraryDTO set libraryDTO.bookPages =: pages, libraryDTO.bookPrice =: price where libraryDTO.bookName =: name");
		query.setParameter("pages", bookPages);
		query.setParameter("price", bookPrice);
		query.setParameter("name", bookName);
		
		int rows = query.executeUpdate();
		
		if(rows > 0) {
			logger.info("\nUpdate performed");
		}
		else {
			logger.warning("\nUpdate could not performed");
		}
		
		
		transaction.commit();
		session.close();
	}
	
	public void deleteBookByID(String bookID) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		LibraryDTO deleteDTO = session.get(LibraryDTO.class, bookID);
		
		session.delete(deleteDTO);
		transaction.commit();
		
		logger.info("\nDeleted record");
		System.out.println("\nBook ID : "+deleteDTO.getBookID()+"\nBook Name : "+deleteDTO.getBookName()+"\nNo. of Pages : "+deleteDTO.getBookPages()+"\nBook Price : "+deleteDTO.getBookPrice());
		
		session.close();
		
	}
	
	public void deleteBookByName(String bookName) {
		
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from LibraryDTO libraryDTO where libraryDTO.bookName = '"+bookName+"'");
		int rows = query.executeUpdate();
		
		if(rows > 0) {
			logger.info("\nDelete performed");
		}
		else {
			logger.warning("\nDelete could not be performed");
		}
		
		transaction.commit();
		session.close();
	}

}
