<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->

<title>Profile View:  ${employee.name.first} ${employee.name.middle}. ${employee.name.last} </title>

</head>
<body>
	<div class="container">
	  <h3><img alt="" src="${employee.picture}">   ${employee.name.first} ${employee.name.middle}. ${employee.name.last}</h3>
	  <div class="well">
		<b>ID:</b>  ${employee.id}  <br/><br/>
		<b>Profile:</b> <br/> ${employee.profile}<br/><br/>
		<b>E-mail:</b> ${employee.email}<br/>
		<b>Phone:</b> ${employee.phone}<br/>
		<b>Address:</b> ${employee.address}<br/>
		<b>Age:</b> ${employee.age}<br/>
		<b>Balance:</b> ${employee.balance}<br/><br/>
	  </div>
	</div>
</body>
</html>