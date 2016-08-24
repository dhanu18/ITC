<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<%@ page import="ij.io.DirectoryChooser" %>


<%
DirectoryChooser dc=new DirectoryChooser("image");

 %>


<html>
<head>
   
<script type="text/javascript">






function byname(){

  

document.getElementById('searching').style.display= 'block';  
document.getElementById('alls').style.display='none';
document.getElementById('searchingdate').style.display='none';
}


function bydate(){

  
document.getElementById('searchingdate').style.display= 'block'; 
document.getElementById('alls').style.display='none';
document.getElementById('searching').style.display='none';
}




</script>
<style type="text/css">

body{
color: none;
font: bold;

}
</style>

</head>

<body bgcolor="	#708090">

<br><br><br>
<form  action="all" name="search" ><table cellpadding="10" cellspacing="10" border="05" bordercolor="navy">

<tr><td>select Directory: </td><td><input type="text" name="folder" value="<%=dc.getDirectory() %>"/> </td><br><br>


<tr><td><input type="radio" name="con" onclick="byname()">Search By Name </td><td><input type="radio" name="con" onclick="bydate()">Search By Date </td></tr><br>



<div><tr><td><input type="submit" value="search" id="alls" ></td></tr></div>


</table>
</form><br><br>

<FORM action="byname">
<input type="hidden" name="folder" value="<%=dc.getDirectory()%>" >

<div id="searching" style="display : none"><table cellpadding="10" cellspacing="10" border="05" bordercolor="navy">
<tr><td>Enter any name  you want to search :</td><td><input type="text" name="name"></td></tr><tr><td><input type="submit" value="search by name"></td></tr>


</table>
</div>

</FORM><br><br>
<FORM action="bydate" onsubmit="return img()">
<input type="hidden" name="folder" value="<%=dc.getDirectory()%>" >

<div id="searchingdate" style="display : none"><table cellpadding="10" cellspacing="10" border="05" bordercolor="navy">


<tr><td>Enter date in (mm-dd-yyyy) format :</td><td>
        
        <input type="date" id="date1" name="date1" maxlength="25" size="25"/>
        </td>
    </tr><tr><td>Enter date in (mm-dd-yyyy) format : </td><td><input type="date" id="date2" name="date2" maxlength="25" size="25"/>
        </td></tr><tr><td><input type="submit" value="search by date"></td></tr>
</table>
</div>

</FORM>




</body>

</html><br><br><br><br><br><br><br>