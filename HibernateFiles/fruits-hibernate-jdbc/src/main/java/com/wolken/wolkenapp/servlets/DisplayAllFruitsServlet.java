package com.wolken.wolkenapp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.FruitsDTO;
import com.wolken.wolkenapp.service.FruitsService;
import com.wolken.wolkenapp.service.FruitsServiceImpl;

@WebServlet(urlPatterns = "/call")

public class DisplayAllFruitsServlet extends HttpServlet {
	
	FruitsService fruitsService = new FruitsServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<FruitsDTO> fruitsList = fruitsService.validateAndDisplayAll();
		
		req.setAttribute("fruitsList", fruitsList);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("displayAll.jsp");
		requestDispatcher.forward(req, resp);
		
//		PrintWriter printWriter = resp.getWriter();
//
//		resp.setContentType("text/html");
//		
//		
//		printWriter.print("<body style = 'text-align:center'>"
//				+ "<h1>DATABASE RECORDS</h1>"
//				+ "<br>"
//				+ "<a href = 'http://localhost:8080/fruits-hibernate-jdbc/fruits.jsp'>"
//				+ "Go Back to Home Page"
//				+ "</a>"
//				+ "</body>");
//		
//		for(FruitsDTO fruitRec : fruitsList) {
//			printWriter.print("<p>Fruit ID : "+fruitRec.getFruitID()+"<br>");
//			printWriter.print("Fruit Name : "+fruitRec.getFruitName()+"<br>");
//			printWriter.print("Fruit Colour : "+fruitRec.getFruitColor()+"<br>");
//			printWriter.print("Fruit Price : "+fruitRec.getFruitPrice()+"</p><br>");
//		}
//		
//		printWriter.flush();
//		printWriter.close();
//		
		}
		
	}
