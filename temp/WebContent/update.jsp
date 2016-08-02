<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>

<head>
<script type="text/javascript">

function validate(){

    var x = document.forms["update"]["clientid"].value;
    if (x == null || x == "") {
        alert("please enter client id");
        return false;
    }

    var a = document.forms["update"]["unitid"].value;
    if (a == null || a == "") {
        alert("please enter unitid id");
        return false;
    }
    var y = document.forms["update"]["tempval"].value;
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



</head>

<center><h1>update record</h1></center>

<form name="update" action="/temp/us" onsubmit="return validate()">
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
<td><input type="text" name="paramid" value="${list.paramId}" maxlength="05"></td>
<td><input type="text" name="clientid"  onkeypress="return isNumberKey(event)" maxlength="05"></td>
<td><input type="text" name="dom" value="${list.dom}"></td>
<td><input type="text" name="unitid" maxlength="10"></td>
<td><input type="text" name="tempval"  onkeypress="return isNumberKey(event)" maxlength="05"></td>
</tr>

</c:forEach>
</table>
<center><input type="submit" value="update"></center>
<a href="home.jsp">back to home</a>
</form>
</html>