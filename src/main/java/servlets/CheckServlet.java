package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String lb = req.getParameter("lb");
		String rb = req.getParameter("rb");
		String res;
		if(rb.equals("yes") && lb.equals("yes")) {
			res = "ball check passed";
		}else if(rb.equals("no") && lb.equals("no")){
			res = "Isufficient balls count -> ball check failed";
		}else {
			res = "Results uncertain -> provide more balls data";
		}
		
		PrintWriter out = resp.getWriter();
		out.println(res);
	}
}
