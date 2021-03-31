package com.wolken.wolkenapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.FruitsDTO;
import com.wolken.wolkenapp.service.FruitsService;
import com.wolken.wolkenapp.service.FruitsServiceImpl;

@WebServlet(urlPatterns = "/addFruit", loadOnStartup = +23)

public class AddFruitServlet extends HttpServlet {

	public AddFruitServlet() {
		System.out.println("AddFruitServlet obj created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String ID = req.getParameter("id");
		int fruitID = Integer.parseInt(ID);
		String fruitName = req.getParameter("name");
		String fruitColor = req.getParameter("color");
		String price = req.getParameter("price");
		double fruitPrice = Double.parseDouble(price);

		FruitsDTO fruitsDTO = new FruitsDTO();
		fruitsDTO.setFruitID(fruitID);
		fruitsDTO.setFruitName(fruitName);
		fruitsDTO.setFruitColor(fruitColor);
		fruitsDTO.setFruitPrice(fruitPrice);

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		
		printWriter.print("<body style = 'text-align:center'>"
				+ "<h1>DATABASE UPDATED WITH NEW ADDITIONS</h1>"
				+ "<br>"
				+ "<a href = 'http://localhost:8080/fruits-hibernate-jdbc/fruits.jsp'>"
				+ "Go Back to Main Page"
				+ "</a>"
				+ "</body>");		

		FruitsService fruitsService = new FruitsServiceImpl();
		fruitsService.validateAndAdd(fruitsDTO);
		
		printWriter.flush();
		printWriter.close();
	}
}
