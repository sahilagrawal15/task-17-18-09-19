package com.wp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conn {
	
	public static SessionFactory getSF()
	{
	Configuration config=new Configuration().configure().addAnnotatedClass(ModelClass.class);
	SessionFactory sf=config.buildSessionFactory();
	return sf;
	}

}
