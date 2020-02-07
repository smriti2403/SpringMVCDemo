<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Add Employee Details</h2>
		<form:form modelAttribute="empObj" method="GET"
			action="${pageContext.request.contextPath}/saveEmployee.html">

			<br>

			<table border="2">
				<tr>
					<th>EmployeeName</th>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<th>Role</th>
					<td>
						<form:select path="role">
							<form:option value="" label="--Select--" />
							<form:option value="TL" label="TeamLead" />
							<form:option value="M" label="Manager" />
							<form:option value="SE" label="Software Engineer" />
						</form:select>
					</td>
				</tr>
				<tr>
					<th>Salary</th>
					<td>
						<form:input path="salary"/>
					</td>
				</tr>
				<tr>
					<th>Employee Date of Joining</th>
					<td>
						<form:input path="insertTime"/>
					</td>
				</tr>
				


			</table>

		<input type="submit" value="Register"/>

		</form:form>
	</center>
</body>
</html>