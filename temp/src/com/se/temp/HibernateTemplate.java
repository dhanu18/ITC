package com.se.temp;

import java.util.*;

import org.hibernate.*;


public class HibernateTemplate {

	
	public void save(Temperature t){
		
			
		Session s=HibernateSingleton.getSession();
		Transaction tx=s.beginTransaction();
		
		s.save(t);
				
		tx.commit();
		
	}
	public ArrayList load(TempDTO dto){
		
		String paramId=dto.getParamId();
		
		String hquery="from com.se.temp.Temperature";
		
		if(paramId.equals("")){
			hquery=hquery;
		System.out.println("inif");
		}
		else{
			hquery=hquery + " where paramid = "+paramId; 
			System.out.println("else");
				
		}
		Session s=HibernateSingleton.getSession();
		Query query=s.createQuery(hquery);
		ArrayList list=(ArrayList)query.list();
		
		return list;
	}
	
	
	public ArrayList retrive(TempDTO dto){
		
        String paramId=dto.getParamId().toString();
		
		String hquery="from com.se.temp.Temperature where paramId = "+paramId;

		Session s=HibernateSingleton.getSession();
		Query query=s.createQuery(hquery);
		List list=query.list();
		ArrayList al=(ArrayList)list;
		
		return al;
	}
	
	
	
	
	
	
	public void update(Temperature t){
		
		
		int paramId=t.getParamId();
		String hquery="update from com.se.temp.Temperature t set t.clientId=?,t.dom=?,t.unitId=?,t.tempVal=? where paramId= "+paramId;;
		
		
		System.out.println(t.getDom());
		System.out.println(t.getTempVal());
		System.out.println(t.getParamId());
		System.out.println(t.getClientId());
		System.out.println(t.getUnitId());

		Session s=HibernateSingleton.getSession();
		Transaction tx=s.beginTransaction();
		Query query=s.createQuery(hquery);
		query.setParameter(0,t.getClientId());
		query.setParameter(1,t.getDom());
		query.setParameter(2,t.getUnitId());
		query.setParameter(3,t.getTempVal());
		
		query.executeUpdate();
		
	
		tx.commit();
		
		
	}
	public int delete(TempDTO dto){
		
		String paramId=dto.getParamId();
		
		

		Session s=HibernateSingleton.getSession();
		Transaction tx=s.beginTransaction();
		String hquery="delete from com.se.temp.Temperature where paramid = "+paramId;
		Query query=s.createQuery(hquery);
		int no=query.executeUpdate();
				
		tx.commit();
		
		
		return no;
		
	}
	
}
