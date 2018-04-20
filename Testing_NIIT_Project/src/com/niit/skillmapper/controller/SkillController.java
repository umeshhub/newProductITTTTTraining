package com.niit.skillmapper.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.skillmapper.dao.SkillDAO;
import com.niit.skillmapper.dao.SkillDAOImpl;
import com.niit.skillmapper.model.Skills;

/**
 * Servlet implementation class SkillController
 */
@WebServlet("/skills")
public class SkillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private List<Skills>  skillLists;
	
	private SkillDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SkillController() {
        super();
        // TODO Auto-generated constructor stub
        
        dao=new SkillDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	PrintWriter out=response.getWriter();	
		int i=1;
		skillLists=dao.getSkillsByStatus();
		
		
		out.println("<html>");
		out.println("<head>");
		
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=''>");
		out.println("<h3 align='center'>Employee Skills List....</h3>");
		
		out.println("<table>");
		out.println("<tr><th>Employee Code</th><th>SkillSet</th><th>Certification</th><th>Trained Hours</th><th>Students Trained</th><th>Rating</th><th>Student Placed</th><th>Total Experience </th><th>Language Known </th><th>Approved(A/R)</th><th>Remarks</th></tr>");
		if(!skillLists.isEmpty())
		{
			
			for(Skills  skill :  skillLists)
			{
				out.println("<tr><td>"+skill.getEmpcode()+"</td><td>"+skill.getSkill()+"</td><td>"+skill.getCertification()+"</td><td>"+skill.getTeachingHours()+"</td><td>"+skill.getStudentsTrained()+"</td><td>"+skill.getRating()+"</td><td>"+skill.getStudentPlaced()+"</td><td>"+skill.getYearsofexperince()+"</td><td>"+skill.getLanguage()+"</td><td><input type=checkbox name=c"+i+"></td><td><input type=text name=rmks></td></tr>");
				System.out.println(i);
				i++;
			}
		}
		
		out.println("</form>");
		out.println("<table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
