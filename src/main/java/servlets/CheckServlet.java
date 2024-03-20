package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBManager;

public class CheckServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		DBManager dbManager = new DBManager();
		Connection connection = dbManager.getConnection("Aircompany", "postgres", "Vlad10092004");
		PrintWriter writer = resp.getWriter();
		if(connection != null) {
			writer.println("Connected!");
		}else {
			writer.println("Nuh uh");
		}
	}
}
