  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!-- JSTL library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">	
	<link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/time.js"></script>
	<title>Time</title>
</head>
<body>
	<div>
	<h1 class="time"><c:out value="${time}" /></h1>
	</div>
</body>
</html>