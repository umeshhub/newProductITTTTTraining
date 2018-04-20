package com.niit.skillmapper.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.client.Client;
import com.niit.client.Client;
import com.niit.skillmapper.dao.EmployeeDAO;
import com.niit.skillmapper.dao.EmployeeDAOImpl;
import com.niit.skillmapper.model.Employee;
import com.niit.skillmapper.model.User;
import com.niit.skillmapper.validators.Validator;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private List<String> errors=new LinkedList<>();
	//private Client client=new Client();
	
	EmployeeDAO  dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        
        dao=new EmployeeDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	int emp_code=0;
		try
		{
		emp_code=Integer.parseInt(request.getParameter("code").trim());
		}
		catch(NumberFormatException ne)
		{
			
			errors.add("Employee Id should be a possitive Integer.....");
		}
		String name =request.getParameter("name").trim();
		String designation=request.getParameter("desgn").trim();
		String gender=request.getParameter("gender").trim();
		String city=request.getParameter("city").trim();
		String contact=request.getParameter("contact").trim();
		String email=request.getParameter("email").trim();
		String dateofjoining=request.getParameter("dateofjoining").trim();
		String dateofbirth=request.getParameter("dateofbirth").trim();
		String password=request.getParameter("password").trim();
		String confirmPassword=request.getParameter("confirmpassword").trim();
		String role=request.getParameter("role").trim();

		
/*		System.out.println(name);
		
		if(Validator.rejectIfEmpty(name))
		{
			errors.add("Name Field cannot be Left Blank.....");
		}
		
		
		
		if(Validator.rejectIfEmpty(designation))
		{	errors.add("Designation Field Field cannot be Left Blank.....");}
		
		if(Validator.rejectIfEmpty(gender))
		{	errors.add("Gender Field cannot be Left Blank.....");}
		
		
		
		if(Validator.rejectIfEmpty(contact))
		{	errors.add("Phone Field cannot be Left Blank.....");}
		
		try
		{
		if(Validator.rejectValue(contact))
				{	errors.add("Phone no should be of 10 Digits.....");}
		
		}
		catch(NumberFormatException exe)
		{
			errors.add("Contact No should be a possitive Integer.....");
		}
		
		
		if(Validator.rejectIfEmpty(email))
		{	errors.add("Email Field cannot be Left Blank.....");}
		
		if(Validator.rejectEmailValue(email))
		{	errors.add("Email Id is not Valid.....");}
		
		
		
		
		if(Validator.rejectIfEmpty(dateofjoining))
		{	errors.add("Date Of Joining Field cannot be Left Blank.....");}
		
		if(Validator.isValidDate(dateofjoining))
		{	errors.add("Date Of Joining  cannot be Greater than today's Date.....");}
		
		

		if(Validator.rejectIfEmpty(dateofbirth))
		{	errors.add("Date Of Birth Field cannot be Left Blank.....");}
		
		if(Validator.isValidDate(dateofbirth))
		{	errors.add("Date Of Birth  cannot be Greater than today's Date.....");}
		
		
		
		
		
		if(Validator.rejectIfEmpty(password))
		{	errors.add("Password Field cannot be Left Blank.....");}
		
		

		if(Validator.rejectIfEmpty(confirmPassword))
		{	errors.add("Confirmation Password Field cannot be Left Blank.....");}
		
		

		if(Validator.isPasswordDifferent(password, confirmPassword))
		{	errors.add("Password and Confirm Password Field are not same.....");}
		
		if(Validator.rejectIfEmpty(role))
		{	errors.add("Role Field are not same.....");}
		
		
		
		if(!errors.isEmpty())
		{
			request.setAttribute("errors",errors);
			
			
			request.getRequestDispatcher("/WEB-INF/views/jsp/index.jsp").forward(request, response);
		}
		else
		{
		
		*/
		/*
		int id,String name, String designation, String gender, String city, String contactNo,
		String emailid, String dateofjoining, String dateofbirth,String username,String password,String role*/
		
		Employee e=new Employee(emp_code,name, designation, gender, city, contact, email, dateofjoining, dateofbirth);
		
		User user=new User(e.getId(),password, role, "N","Approval Pending");
		e.setUser(user);
		
		//commented by Umesh
		/*User user=e.getUser();
		user.setId(e.getId());
		//user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);*/
		
	 int rows=dao.addEmployee(e);
			//Process insert to employee and User table
		 
		 if(rows > 0)
			  request.getRequestDispatcher("/WEB-INF/views/jsp/home.jsp").forward(request, response); 
	
		
	
	
	}
		
		
	//	 request.getRequestDispatcher("/WEB-INF/views/jsp/SkillNIIT.jsp").forward(request, response);
		
		
	}

//}
