package com.se.temp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataStoreServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		int clientId=Integer.parseInt(req.getParameter("clientid"));
		String unitId=req.getParameter("unitid");
		int tempVal=Integer.parseInt(req.getParameter("tempval"));
		
		Date d=new Date();
		String dom=d.toString();
		
		
		Temperature t=new Temperature();
		
		t.setClientId(clientId);
		t.setDom(dom);
		t.setUnitId(unitId);
		t.setTempVal(tempVal);
		
		
		HibernateTemplate ht=new HibernateTemplate();
		ht.save(t);
		
		
		out.println("data stored into database server successfully");
		
	}
	
	
}