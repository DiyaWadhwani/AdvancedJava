package com.wolken.wolkenapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.service.LibraryService;
import com.wolken.wolkenapp.service.LibraryServiceImpl;

@WebServlet(urlPatterns = "/updateByID")

public class UpdateByIDServlet extends HttpServlet{
	
	public UpdateByIDServlet() {
		
		System.out.println("UpdateByIDServlet called");
	}
	
	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		libraryDTO.setBookID(req.getParameter("id"));
		libraryDTO.setBookName(req.getParameter("name"));
		String bookPages = req.getParameter("pages");
		libraryDTO.setBookPages(Integer.parseInt(bookPages));
		String bookPrice = req.getParameter("price");
		libraryDTO.setBookPrice(Double.parseDouble(bookPrice));
		
		libraryService.validateAndUpdateByID(libraryDTO);
		
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