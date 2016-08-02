<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">



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
<form action="/temp/dis">
<table border="05" cellpadding="10" cellspacing="10">
<tr><td>Please enter the Param Id  :</td><td> <input type="text" name="paramid" maxlength="05" onkeypress="return isNumberKey(event)"/></td></tr>
<tr><td><input type="submit" value="Retrive"/></td></tr>



</table>
<a href="home.jsp">back to home</a>
</form>



</body>
</html>