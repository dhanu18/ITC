<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>

<body bgcolor="#708090">

<form action="dupli">
<input type="hidden" name="fol" value="${folder}">





<input type="submit" value="click here to find dulpies" style="float: none;color: red" >


</form>
</body>




</html>
<b><font color="red">List of files  :</font></b>
<table border="10" cellpadding="05" cellspacing="05" >

  <tr>
    <th>File Name</th>
    <th>Image</th>
  </tr>
  <c:forEach var="map" items="${map}">
  <tr>
    <td>${map.key}</td>
    <td><img src="${map.value}" height="100" width="100"/></td>
  </tr>
  </c:forEach>
  
  
  <c:forEach var="map1" items="${map1}">
  <tr>
    <td>${map1.key}</td>
    <td>${map1.value}
    <form action="all">
   <input type="hidden" name="folder" value="${map1.value}">
    <input type="submit" value="click">
    
    </form>
    
    
    
    </td>
  </tr>
  </c:forEach>
 
  
</table>

<a href="home.jsp">Home</a><br><br><br><br><br><br><br><br><br>

