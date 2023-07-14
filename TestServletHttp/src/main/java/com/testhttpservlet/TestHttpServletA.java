package com.testhttpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHttpServletA extends HttpServlet
{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
     {
        	//setContentType()call to res object
        	res.setContentType("text/html");
        	String s1="message";
        	System.out.println("print this HttpServlet");
        	//res object call to getWriter() after that getWriter method return printWriter Stream return karta hai
        	//iss liey aap PrintWriter object ma store karengay
        	PrintWriter out=res.getWriter();
			out.println("<h1>"+s1+"</h1>");
        	//out method call karta hai print ln method ko aaur print ln method ham aapna html code likhate hai
    }
}
