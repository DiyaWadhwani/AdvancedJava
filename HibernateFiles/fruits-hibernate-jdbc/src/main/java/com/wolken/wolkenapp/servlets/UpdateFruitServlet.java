
//initial update without HQL query
package com.wolken.wolkenapp.servlets;

//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.wolken.wolkenapp.dto.FruitsDTO;
//import com.wolken.wolkenapp.service.FruitsService;
//import com.wolken.wolkenapp.service.FruitsServiceImpl;
//
//@WebServlet(urlPatterns = "/updateFruit", loadOnStartup = +23)
//
//public class UpdateFruitServlet extends HttpServlet {
//	
//	public UpdateFruitServlet() {
//		System.out.println("UpdateFruitServlet obj created");
//	}
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		FruitsDTO fruitsDTO = new FruitsDTO();
//		
//		String ID = req.getParameter("id");
//		System.out.println(ID);
//		int fruitID = Integer.parseInt(ID);
//		System.out.println(fruitID);
//		fruitsDTO.setFruitID(fruitID);
//		fruitsDTO.setFruitName(req.getParameter("name"));
//		fruitsDTO.setFruitColor(req.getParameter("color"));
//		String price = req.getParameter("price");
//		fruitsDTO.setFruitPrice(Double.parseDouble(price));
//		
//		FruitsService fruitsService = new FruitsServiceImpl();
//		fruitsService.validateAndUpdate(fruitsDTO);
//		
//		PrintWriter printWriter = resp.getWriter();
//
//		resp.setContentType("text/html");
//
//		printWriter.print("<body style = 'text-align:center'>"
//				+ "<h1>DATABASE UPDATED WITH NEW CHANGES</h1>"
//				+ "<br>"
//				+ "<a href = 'http://localhost:8080/fruits-hibernate-jdbc/fruits.jsp'>"
//				+ "Go Back to Home Page"
//				+ "</a>"
//				+ "</body>");
//		
//		printWriter.flush();
//		printWriter.close();
//
//		
//	}
//
//}
