package com.se.temp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		PrintWriter out=res.getWriter();
		
		int paramId=Integer.parseInt(req.getParameter("paramid"));

		int clientId=Integer.parseInt(req.getParameter("clientid"));
		String unitId=req.getParameter("unitid");
		int tempVal=Integer.parseInt(req.getParameter("tempval"));
		
		Date d=new Date();
		String dom=d.toString();
		
	out.println(paramId);
	out.println(clientId);
	out.println(unitId);
	out.println(dom);
	out.println(tempVal);
	
		Temperature t=new Temperature();
		t.setParamId(paramId);
		t.setClientId(clientId);
		t.setDom(dom);
		t.setUnitId(unitId);
		t.setTempVal(tempVal);
		HibernateTemplate ht=new HibernateTemplate();
		ht.update(t);
		
		
	}
	
	
}