package com.se.temp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		
		String paramId=req.getParameter("paramid");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		TempDTO dto=new TempDTO();
		dto.setParamId(paramId);
		
		HibernateTemplate ht=new HibernateTemplate();
		int no=ht.delete(dto);
		if(no==1){
		out.print("record deleted");

		}else{
			
			
			out.println("no record with this id please enter valid id");
		}
		
		
	}
	
	
	
}
