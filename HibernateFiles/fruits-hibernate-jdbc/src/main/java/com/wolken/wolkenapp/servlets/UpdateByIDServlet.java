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

@WebServlet(urlPatterns = "/updateByID")

public class UpdateByIDServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		FruitsDTO fruitsDTO = new FruitsDTO ();
		
		String ID = req.getParameter("id");
		int fruitID = Integer.parseInt(ID);
		fruitsDTO.setFruitID(fruitID);
		fruitsDTO.setFruitName(req.getParameter("name"));
		fruitsDTO.setFruitColor(req.getParameter("color"));
		String price = req.getParameter("price");
		double fruitPrice = Double.parseDouble(price);
		fruitsDTO.setFruitPrice(fruitPrice);
		
		FruitsService fruitsService = new FruitsServiceImpl();
		fruitsService.validateAndUpdateByID(fruitsDTO);
		
		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");

		printWriter.print("<body style = 'text-align:center'>"
				+ "<h1>DATABASE UPDATED WITH NEW CHANGES</h1>"
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
