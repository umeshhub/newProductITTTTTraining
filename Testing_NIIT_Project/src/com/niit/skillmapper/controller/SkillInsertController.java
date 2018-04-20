package com.niit.skillmapper.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.skillmapper.dao.SkillDAO;
import com.niit.skillmapper.dao.SkillDAOImpl;
import com.niit.skillmapper.model.Skills;

/**
 * Servlet implementation class SkillInsertController
 */
@WebServlet("/insert.do")
public class SkillInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SkillDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillInsertController() {
        super();
        dao=new SkillDAOImpl();
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
		
		
		
		String skills=request.getParameter("skSet").trim();
		String certificate=request.getParameter("cert").trim();
		
		int  traininghours=Integer.parseInt(request.getParameter("th").trim());
		int studenttrained=Integer.parseInt(request.getParameter("StdT").trim());
		int rating=Integer.parseInt(request.getParameter("fr").trim());
		int splc=Integer.parseInt(request.getParameter("splc").trim());
				
		int totalexpr=Integer.parseInt(request.getParameter("yexp").trim());
		
		String language=request.getParameter("lknow").trim();
		
		/*
		int empcode,String skill, String certification,  int teachingHours, int studentsTrained,
		int rating, int studentPlaced, int yearsofexperince,String language)*/ 
		
		
		Skills  skill=new Skills(101,skills,certificate,traininghours,studenttrained,rating,splc,totalexpr,language);
		int rows=dao.insertSkills(skill);
		
		if(rows > 0)
		{
			//Commented by Umesh
			response.getWriter().println("Data Inserted....");
		}
		
	}

}
