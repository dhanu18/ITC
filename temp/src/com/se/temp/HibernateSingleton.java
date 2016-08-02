package com.se.temp;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateSingleton {
	private static Configuration cfg;
	static{
	
	cfg=new Configuration();
	cfg.configure();
	
	}


	public static Session getSession(){
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		return sf.openSession();
	}

}
