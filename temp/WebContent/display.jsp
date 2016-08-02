<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<center><h1>temperature details</h1></center>

<form action="/temp/us">
<table border="05" cellpadding="02" cell spacing="05" width="500" align="center">
<tr>
<th>param Id</th>
<th>Client Id</th>
<th>Date</th>
<th>unit Id</th>
<th>Temp val</th>
</tr>

<c:forEach var="list" items="${list }">
<tr>
<td><input type="text" name="paramid" value="${list.paramId}"></td>
<td><input type="text" name="clientid" value="${list.clientId}"></td>
<td><input type="text" name="dom" value="${list.dom}"></td>
<td><input type="text" name="unitid" value="${list.unitId}"></td>
<td><input type="text" name="tempval" value="${list.tempVal}"></td>
</tr>

</c:forEach>
</table>
<a href="home.jsp">back to home</a>
</form>
</html>