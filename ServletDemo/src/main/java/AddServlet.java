import java.io.IOException;


import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//life cycle 
//class is loaded
//instance is created
//init->service->destroy

public class AddServlet extends HttpServlet {

//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		
//		int k=i+j;
//		
//		PrintWriter out=res.getWriter();
//		out.println("Result is::"+k);
//	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		performOps(req, res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		performOps(req, res);
	}
	
	public void performOps(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.println("Result is::"+k);
	}
}
