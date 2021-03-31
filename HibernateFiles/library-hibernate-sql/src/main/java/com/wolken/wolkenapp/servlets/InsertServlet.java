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

@WebServlet(urlPatterns = "/insertBook", loadOnStartup = +23)
public class InsertServlet extends HttpServlet {
	
	LibraryDTO libraryDTO = new LibraryDTO();
	LibraryService libraryService = new LibraryServiceImpl();
	
	public InsertServlet() {
		System.out.println("InsertServlet called");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		try {
			libraryDTO.setBookID(req.getParameter("id"));
			libraryDTO.setBookName(req.getParameter("name"));
			String pages = req.getParameter("pages");
			libraryDTO.setBookPages(Integer.parseInt(pages));
			String price = req.getParameter("price");
			libraryDTO.setBookPrice(Double.parseDouble(price));
			libraryService.validateAndInsert(libraryDTO);
//		}
//		catch(NumberFormatException e) {
//			System.out.println(e.toString());
//		}
		
		PrintWriter printWriter = resp.getWriter();
		
		resp.setContentType("text/html");
		
		printWriter.print("<body style = 'text-align:center' >"
				+ "<h1 style = 'margin-top:20px'>New Book added to Library</h1>"
				+ "<br>"
				+ "<a href = 'library.jsp'>Go Back to Home Page</a>"
				+ "</body>");
		
		printWriter.flush();
		printWriter.close();
		
		
		
		
		
	}

}
