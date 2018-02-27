<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile List</title>
<style>
body {
	margin-top: 60px;
	width: 80%;
	color: #333;s
}

a {
	text-decoration: none;
	color: #444;
	
}

h3 {
	margin-left: 16%;
	font-family: arial;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 80%;
    margin-left: 16%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

	<h3>PROFILE LIST</h3>
	<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Active</th>
        <th>Blocked</th>
    </tr>
    	<c:forEach var="item" items="${list}">
	<tr>
	    <td>
	    	<a href="http://localhost:8081/JoshTestApp/EmployeeServlet?id=${item.id}">
		    	<c:out value="${item.name.first}"/> 
		    	<c:out value="${item.name.middle}"/>.
		    	<c:out value="${item.name.last}"/>
	    	</a>
	    </td>
	    <td><c:out value="${item.age}"/></td>
	    <c:choose>
			    <c:when test = "${item.active == true}">
		            <td><input type="checkbox" onclick="return false;" checked/></td>
		        </c:when>
		         
		        <c:when test = "${item.active == false}">
		            <td><input type="checkbox" onclick="return false;"/></td>
		        </c:when>
	    </c:choose>
	    	    <c:choose>
			    <c:when test = "${item.blocked == true}">
		            <td><input type="checkbox" onclick="return false;" checked/></td>
		        </c:when>
		         
		        <c:when test = "${item.blocked == false}">
		            <td><input type="checkbox" onclick="return false;"/></td>
		        </c:when>
	    </c:choose>
	    
	</tr>
	</c:forEach>
 
</table>
</body>
</html>