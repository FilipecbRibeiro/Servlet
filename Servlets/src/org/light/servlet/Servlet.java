package org.light.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//configured the Build Path to add external Jars ---->servlet-api (inside of lib)
/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		System.out.println("Hello World, I'm Filipe!! ");//-->how to print this in the page directly?
		//The answer will pass by using the response received in the argument
		
		response.getWriter().println("<h1> Hello World, I'm Filipe!</h1>");
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
/*
  Whenever we execute a JSP SERVLET application that application will always run inside of a Servlet container(Mother Shell inside which the web application will be executed )
  Once the application starts to execute there are several steps involved 
  	-> load servlet class
  	-> create instance of servlets
  	-> call the servlets init() method
  	
  	ONLY WHEN THIS 3 STEPS ARE COMPLETED IT WILL BE ABLE TO: 
  	
  	-> call the servlets service() method --> for instance whenever there is a request method this method will be called 
  	
  	************ AFTER EVERYTHING COMPLETED 
  	*
  	*-> Call the servlets destroy() method 
  
  	The container will take implicity care of this steps!!!!!!!!!
 */
