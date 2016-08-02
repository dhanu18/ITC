<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

function validate(){

    var x = document.forms["insert"]["clientid"].value;
    if (x == null || x == "") {
        alert("please enter client id");
        return false;
    }

    var a = document.forms["insert"]["unitid"].value;
    if (a == null || a == "") {
        alert("please enter unitid id");
        return false;
    }
    var y = document.forms["insert"]["tempval"].value;
    if (y == null || y == "") {
        alert("please enter tempval");
        return false;
    }


}

function isNumberKey(evt)
      {
         var charCode = (evt.which) ? evt.which : event.keyCode
         if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;
 
         return true;
      }









</script>






<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/temp/ds" name="insert" onsubmit="return validate()">
<table border="05" cellpadding="10" cellspacing="10">
<tr><td>Param Id  :</td><td> <input type="text" name="paramid" disabled="disabled"/></td></tr>
<tr><td>Client Id :</td><td> <input type="text" name="clientid" onkeypress="return isNumberKey(event)" maxlength="05"/></td></tr>
<tr><td>Date :</td><td> <input type="text" name="dom" disabled="disabled"/></td></tr>
<tr><td>Unit Id :</td><td> <input type="text" name="unitid" maxlength="20"/></td></tr>
<tr><td>Temp Val :</td><td> <input type="text" name="tempval" onkeypress="return isNumberKey(event)" maxlength="05"/></td></tr>
<tr><td><input type="submit" value="Insert "/></td></tr>



</table>
<a href="home.jsp">back to home</a>
</form>



</body>
</html>