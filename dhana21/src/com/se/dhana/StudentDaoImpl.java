package com.se.dhana;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class StudentDaoImpl implements StudentDaoInterface {
	
	
	@Autowired
	private SessionFactory sf;
	
	
	

	@Override
	public void save(Object o) {
		
	
	
	sf.getCurrentSession().save(o);
		
		
	}




	@Override
	public List retrive(String sid) {
		
		String query="from com.se.dhana.Student";
		
	
		if(sid==null||sid.equals("")){
			
			query=query;
			
		}else{
			
			query=query+" where sid="+sid;
			
		}
		System.out.println(query);
		Query q=sf.getCurrentSession().createQuery(query);
		List l=q.list();
		
		
		return l;
	}

}
