package std.servlet;

import std.dao.*;
import std.dto.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Studentser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("pwd");
		String address=req.getParameter("add");
		long phone=Long.parseLong(req.getParameter("ph"));
		
		Student s1=new Student();
		s1.setAddress(address);
		s1.setEmail(email);
		s1.setName(name);
		s1.setPassword(password);
		s1.setPhoneNumber(phone);
		
		StudentDao dao=new StudentDao();
		dao.saveStudent(s1);
		
		
		PrintWriter pw=resp.getWriter();
		pw.print("saved");
	}

}
