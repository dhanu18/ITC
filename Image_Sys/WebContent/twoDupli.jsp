<%@page import="ij.io.DirectoryChooser" %>

<%

DirectoryChooser dc1=new DirectoryChooser("select folder1");


DirectoryChooser dc2=new DirectoryChooser("select folder2");



 %>



<html>
<head>

<title>Duplicate Image finder</title>
</head>
<body bgcolor="#708090" >
<h2><font color="maroon"> duplicates in two directories:</font></h2>
<form action="ddupli"><table cellpadding="10" cellspacing="10" border="05" bordercolor="navy">

<tr><td>Enter Folder 1 path : </td><td><input type="text" name="folder1" value="<%=dc1.getDirectory()%>"></td></tr><br><br>
<tr><td>Enter Folder 1 path :</td><td><input type="text" name="folder2" value="<%=dc2.getDirectory()%>"></td></tr><br><br>

<tr><td><input type="submit" value="find duplies"></td></tr>



</table>
</form>
</body>
</html><br><br><br><br><br><br><br><br><br>