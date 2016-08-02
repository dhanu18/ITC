package com.se.dhana;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentModelImpl implements StudentModelInterface {

	@Autowired
	StudentDaoInterface dao;
	
	
	@Override
	public void save(Object o) {
	
	
		
		System.out.println(dao);
		dao.save(o);
			
	}


	@Override
	public List retrive(String sid) {
		
		List l=dao.retrive(sid);
		
		
		
		return l;
	}

}
