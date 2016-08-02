package com.se.temp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		String paramId=req.getParameter("paramid");
		TempDTO dto=new TempDTO();
		dto.setParamId(paramId);
		
		HibernateTemplate ht=new HibernateTemplate();
		ArrayList list=ht.load(dto);
		
		req.setAttribute("list", list);
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
		
		
		
	}
	
	
	
}