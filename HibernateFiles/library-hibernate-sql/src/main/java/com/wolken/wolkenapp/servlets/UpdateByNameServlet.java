package com.wolken.wolkenapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/updateByName")
public class UpdateByNameServlet extends HttpServlet {
	
	LibraryService libraryService = new LibraryServiceImpl();
	
	public UpdateByNameServlet() {
		System.out.println("UpdateByNameServlet called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookName = req.getParameter("name");
		String pages = req.getParameter("pages");
		int bookPages = Integer.parseInt(pages);
		String price = req.getParameter("price");
		double bookPrice = Double.parseDouble(price);
		
		libraryService.validateAndUpdateByName(bookName, bookPages, bookPrice);
		
		PrintWriter printWriter = resp.getWriter();
		
		resp.setContentType("text/html");

		printWriter.print("<body style = 'text-align:center'>"
				+ "<h1>DATABASE UPDATED WITH NEW CHANGES</h1>"
				+ "<br>"
				+ "<a href = 'update.jsp'>"
				+ "Go Back To Update Page"
				+ "</a><br><br>"
				+ "<a href = 'library.jsp'>"
				+ "Go Back to Home Page"
				+ "</a>"
				+ "</body>");
		
		printWriter.flush();
		printWriter.close();
	}

}
