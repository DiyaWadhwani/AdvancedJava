package com.wolken.wolkenapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.service.FruitsService;
import com.wolken.wolkenapp.service.FruitsServiceImpl;

@WebServlet(urlPatterns = "/updateByColor")
public class UpdateByColorServlet extends HttpServlet {
	
	FruitsService fruitsService = new FruitsServiceImpl(); 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fruitColor = req.getParameter("color");
		String fruitName = req.getParameter("name");
		String price = req.getParameter("price");
		double fruitPrice = Double.parseDouble(price);
		
		fruitsService.validateAndUpdateByColor(fruitColor, fruitName, fruitPrice);
		
		PrintWriter printWriter = resp.getWriter();
		
		resp.setContentType("text/html");
		
		printWriter.print("<body style = 'text-align : center' >"
				+"<h1>DATABASE UPDATED WITH NEW CHANGES</h1>"
				+ "<br>"
				+ "<a href = 'update.jsp'>"
				+ "Go Back To Update Page"
				+ "</a><br><br>"
				+ "<a href = 'fruits.jsp'>"
				+ "Go Back to Home Page"
				+ "</a>"
				+ "</body>");
		
		printWriter.flush();
		printWriter.close();
		
	}
	
}
