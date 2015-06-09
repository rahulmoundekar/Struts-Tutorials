package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountPageVisit extends HttpServlet {
	static int count = 0;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if (count == 0) {
			out.print("<body>");
			out.print("<center>");
			out.print("<h1>");
			out.print("Welcome to the fist Time");
			count++;
		} else {
			out.print("<center>");
			out.print("<h1>You have visited " + count + " times");
			count++;
			out.print("</h1>");
			out.print("</center>");
			out.print("</body>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doGet(request, response);
	}
}
