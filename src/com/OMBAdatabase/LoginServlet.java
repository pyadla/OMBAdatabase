package com.OMBAdatabase;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet    
{ 
    public static int login=0;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException  
	{  
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter(); 
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("ombaadmin")){
			if(password.equals("administrator"))
				login=1;
		}
		
		resp.sendRedirect("/JSPfiles/AdminLogin.jsp");		
		out.close();  
	  	  
	 }
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException  
	{  
		doGet(req, resp);  
	}  
}  

