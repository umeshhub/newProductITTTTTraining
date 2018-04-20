<%@page import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
</head>
<body>
<%   

List<String> errors=(List)request.getAttribute("errors");


if(errors != null)
{
if(!errors.isEmpty())
{
	for(String error : errors)
	{
	%>
	<ul>
	<li>
	<font color='red'><%= error %></font>
	</li>
	</ul>
	<%
	
	}
	
	errors.clear();
}
	
}	
	%>
	



<form action="register"  method="post">
<div>

<h3> Employee Registration Form</h3>

</div>
<div>

	<table>
	
	<tr>
	<td>
	Employee Code:
	</td>
	<td>
	<input  type=text name="code"  >
	</td>
	</tr>
	
	
	<tr>
	<td>
	Employee Name:
	</td>
	<td>
	<input type=text name="name">
	</td>
	</tr>
	
	
	<tr>
	<td>
	Designation:
	</td>
	<td>
	<input type=text name="desgn">
	</td>
	</tr>
	
	<tr>
	<td>
	Gender:
	</td>
	<td>
	<input type=text name="gender">
	</td>
	</tr>
	<tr>
	<td>
	City:
	</td>
	<td>
	<input type=text name="city">
	</td>
	</tr>
		
	<tr>
	<td>
	Contact No:
	</td>
	<td>
	<input type=text name="contact">
	</td>
	</tr>
	
	
	
	<tr>
	<td>
	Email:
	</td>
	<td>
	<input type=text name="email">
	</td>
	</tr>
	
	
	<tr>
	<td>
	Date Of Joining(yyyy-mm-dd)
	</td>
	<td>
	<input type=text name="dateofjoining">
	</td>
	</tr>
	
	
	
	<tr>
	<td>
	Date Of Birth(yyyy-mm-dd)
	</td>
	<td>
	<input type=text name="dateofbirth">
	</td>
	</tr>
	
	<tr>
	<td>
	Password
	</td>
	<td>
	<input type=password name="password">
	</td>
	</tr>
	
	<tr>
	<td>
	Confirm Password
	</td>
	<td>
	<input type=password name="confirmpassword">
	</td>
	</tr>
	
	
	<tr>
	<td>
	Role
	</td>
	<td>
	<input type=text name="role">
	</td>
	</tr>
	
	<tr>
	<td>
	
	</td>
	<td>
	<input type=submit value="Register">
	</td>
	</tr>
	</table>


</div>



</form>


</body>
</html>