<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>


<s:form action="getdata" commandName="student">

enter id:<s:input path="sid"/><s:errors path="sid"></s:errors><br>


<input type="submit" value="getdata" >



</s:form>


