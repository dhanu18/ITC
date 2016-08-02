<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<head>
<style type="text/css">
.scrollit {
    overflow:scroll;
    height:500px;
}


</style>


</head>

<body bgcolor="skyblue">
<div class="scrollit" style="float: right">
<table border="10" cellpadding="05" cellspacing="05" width="500">
<th>original files</th>
<c:forEach var="map" items="${map}">
<tr><td>Image   :</td><td><img src="${map.key}" height="100" width="100"/></td></tr>
<tr><td>file name  :</td><td>${map.value}</td>
<td>

<form  action="delete">

<input type="hidden" name="file" value="${map.key}">
<input type="submit"  value="Delete">

</form></td></tr>

</c:forEach>
</table>
</div>

<div class="scrollit" style="float: left">
<table border="10" cellpadding="05" cellspacing="05" width="500">
<th>duplicate files</th>


<c:forEach var="map4" items="${map4}">
<tr><td>Image   :</td><td><img src="${map4.key}" height="100" width="100"/></td></tr>
<tr><td>file name  :</td><td>${map4.value}</td>
<td>

<form  action="delete">

<input type="hidden" name="file" value="${map4.key}">
<input type="submit"  value="Delete">

</form></td></tr>

</c:forEach>
</table>
</div>


</body>