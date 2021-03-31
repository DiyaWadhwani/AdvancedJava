package com.diya.diyasapp.session_factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getFactory () {
		return sessionFactory;
	}
	
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	
	

}
