package com.se.temp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RetriveServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		
		PrintWriter out=res.getWriter();
		String paramId=req.getParameter("paramid");
		TempDTO dto=new TempDTO();
		dto.setParamId(paramId);
		
		HibernateTemplate ht=new HibernateTemplate();
		ArrayList list=ht.retrive(dto);
		if(!list.isEmpty()){
			req.setAttribute("list", list);
			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			rd.forward(req, res);
			
			
		}
		else{
			
			
			
			out.println("no records found");
		}
			
		
		
		
		
		
		
	}
	
	
	
	
}

