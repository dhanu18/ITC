<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
.scrollit {
    overflow:scroll;
    height:400px;
}


</style>



</head>
<body bgcolor="#708090"><br><br><br>


<div style="float: right" class="scrollit">
<table border="01" cellpadding="01" cellspacing="01" width="400" bordercolor="navy">
<th>Duplicate files</th>
<c:forEach var="map" items="${map4}">
<tr><td>Location: </td><td> ${map.key}</td></tr>

<tr><td>Image:</td><td><img src="${map.key}" height="100" width="100"/></td><td>



<form  action="delete">

<input type="hidden" name="file" value="${map.key}">
<input type="submit"  value="Delete">

</form></td></tr>
</c:forEach>
</table>
</div>
</body>


<div style="float: left" class="scrollit" >
<table border="01" cellpadding="01" cellspacing="01"width="400" bordercolor="navy">



<th>original files</th>
<c:forEach var="map" items="${map}">
<tr><td>Location: </td><td> ${map.key}</td></tr>

<tr><td>Image:</td><td><img src="${map.key}" height="100" width="100"/> </td><td>
<form  action="delete">

<input type="hidden" name="file" value="${map.key}">
<input type="submit"  value="Delete">

</form></td></tr>

</c:forEach>



</table>
</div>
</html><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
