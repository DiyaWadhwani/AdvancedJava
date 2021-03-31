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

@WebServlet(urlPatterns = "/deleteByID")
public class DeleteByIDServlet extends HttpServlet {
	
	LibraryService libraryService = new LibraryServiceImpl();
	
	public DeleteByIDServlet() {
		System.out.println("DeleteByIDServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookID = req.getParameter("id");
		libraryService.validateAndDeleteByID(bookID);
		
		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		
		printWriter.print("<body style = 'text-align:center'>"
				+ "<h1>1 ROW DELETED FROM DATABASE</h1>"
				+ "<br>"
				+ "<a href = 'library.jsp'>"
				+ "Go Back to Home Page"
				+ "</a>"
				+ "</body>");
		
		
		
		printWriter.flush();
		printWriter.close();
	}

}
