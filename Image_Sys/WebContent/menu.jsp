<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
	height: 400px;
	width: 200px;
    border: 1px solid;
    
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}

li {
    text-align: center;
    border-bottom: 1px solid #555;
}

li:last-child {
    border-bottom: none;
}

li a.active {
    background-color: #4CAF50;
    color: white;
}

li a:hover:not(.active) {
    background-color: #555;
    color: white;
}
</style>
<title>ITC</title>
</head>
<body >


<ul>
  <li><a class="active" href="home.jsp">Home</a></li><br><br>
  <li><a href="./searchall">Search Files In a Directory</a></li><br><br>
  <li><a href="./twoDupli">Find Duplies In Two Folders</a></li><br><br>
  <li><a href="about">About Smart Enovations Ltd</a></li><br><br>
   <li><a href="contact">Contact Us</a></li>
</ul>

 
<!-- 

<form action="./searchall">		
<div><input type="submit" value="Search Files In a Directory" style="color: red"></div><br><br></form><br><br>

<form action="./twoDupli">
<div><input type="submit" value="Find Duplies In Two Folders" width="50" style="color: red"></div></form><br><br><br><br>

<form action="about">
<div><input type="submit" value="About Smart Enovations Ltd" width="50" style="color: red"></div></form>  -->
</body>
</html>