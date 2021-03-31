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

@WebServlet("/deleteByID")
public class DeleteByIDServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String ID = req.getParameter("id");
		int fruitID = Integer.parseInt(ID);
		
		FruitsService fruitsService = new FruitsServiceImpl();
		fruitsService.validateAndDeleteByID(fruitID);

		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		
		printWriter.print("<body style = 'text-align:center'>"
				+ "<h1>1 ROW DELETED FROM DATABASE</h1>"
				+ "<br>"
				+ "<a href = 'http://localhost:8080/fruits-hibernate-jdbc/fruits.jsp'>"
				+ "Go Back to Home Page"
				+ "</a>"
				+ "</body>");
		
		
		
		printWriter.flush();
		printWriter.close();

	}

}
