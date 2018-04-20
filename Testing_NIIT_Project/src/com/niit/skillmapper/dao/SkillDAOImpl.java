package com.niit.skillmapper.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.niit.skillmapper.model.Skills;
import com.niit.skillmapper.utils.DBConnections;

public class SkillDAOImpl implements SkillDAO{
	
	
	
	
	public List<Skills>  getSkillsByStatus()
	{
		
		 List<Skills> skillList=new LinkedList<>();
		try(PreparedStatement stmt=DBConnections.getConnection().prepareStatement("select a.Emp_Id,Skill,Cert,NTH,NST,Rat,SPlc,Expe,Lkwn from Skills a join users b  on a.emp_id = b.emp_id where b.stts='N'");
				
			ResultSet rs=stmt.executeQuery();	
				
		   )
		{
			
			while(rs.next())
			{
				System.out.println(rs);	
				Skills skills=new Skills(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4),rs.getInt(5),rs.getInt(6), rs.getInt(7), rs.getInt(8),rs.getString(9));
				skillList.add(skills);
			}
			
		}               
		catch(SQLException exe)
		{
		exe.printStackTrace();	
		}
		
		return skillList;
		
		
	}
	
	public int insertSkills(Skills skills)
	{
		int rows=0;
		try(PreparedStatement stmt=DBConnections.getConnection().prepareStatement("insert into Skills(EMP_ID,SKILL,CERT,NTH ,NST,RAT,SPLC,EXPE,LKWN) values (?,?,?,?,?,?,?,?,?)");
				
				
					
			   )
			{
				
			stmt.setInt(1, skills.getEmpcode());
			stmt.setString(2, skills.getSkill());
			stmt.setString(3, skills.getCertification());
			stmt.setInt(4, skills.getTeachingHours());
			stmt.setInt(5, skills.getStudentsTrained());
			stmt.setInt(6, skills.getRating());
			stmt.setInt(7, skills.getStudentPlaced());
			stmt.setInt(8, skills.getYearsofexperince());
			stmt.setString(9, skills.getLanguage());
				rows=stmt.executeUpdate();
				
			}               
			catch(SQLException exe)
			{
				exe.printStackTrace();
			}
			
		return rows;
	}

}
