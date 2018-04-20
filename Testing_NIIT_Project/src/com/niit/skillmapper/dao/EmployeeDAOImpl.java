package com.niit.skillmapper.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.niit.skillmapper.model.Employee;
import com.niit.skillmapper.model.User;
import com.niit.skillmapper.utils.DBConnections;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	/*int id,String name, String designation, String gender, String city, String contactNo,
	String emailid, String dateofjoining, String dateofbirth,String username,String password,String role
	*/public int addEmployee(Employee e)
	{
		int rows=0;
	//Commented by Umesh
		/*Employee e=new Employee(id,name, designation, gender, city, contactNo, emailid, dateofjoining, dateofbirth);
		User user=e.getUser();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		*/
		try(Connection con=DBConnections.getConnection();
			PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?)");
			)
		{
			stmt.setInt(1, e.getId());
			stmt.setString(2, e.getName());
			stmt.setString(3, e.getDesignation());
			stmt.setString(4, e.getGender());
			stmt.setString(5, e.getCity());
			stmt.setString(6, e.getContactNo());
			stmt.setString(7, e.getEmailid());
			
			SimpleDateFormat dtformat=new SimpleDateFormat("yyyy-mm-dd"); 
			java.sql.Date date_of_joining = new java.sql.Date(dtformat.parse(e.getDateofjoining()).getTime()); 

			//SimpleDateFormat dtformat1=new SimpleDateFormat("yyyy-mm-dd"); 
			java.sql.Date date_of_birth = new java.sql.Date(dtformat.parse(e.getDateofbirth()).getTime()); 

			
			stmt.setDate(8, date_of_joining);
			stmt.setDate(9, date_of_birth);
			
			rows=stmt.executeUpdate();
			if(rows > 0)
			{
				PreparedStatement stmt1=con.prepareStatement("insert into users values(?,?,?,?,?)");
				stmt1.setInt(1, e.getUser().getId());
				stmt1.setString(2,e.getUser().getPassword());
				stmt1.setString(3,e.getUser().getRole());
				stmt1.setString(4,e.getUser().getStatus());
				stmt1.setString(5,e.getUser().getRemarks());
				rows=stmt1.executeUpdate();
				
				
				if(rows >0)
					rows=1;
				
			}
			
			
		}
		catch(SQLException | ParseException exe)
		{
			
			exe.printStackTrace();
		}
		
		return rows;
	}
	

}
