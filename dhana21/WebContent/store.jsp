<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>

<s:form action="storeform" commandName="student" method="POST">

<pre>

id : <s:input path="sid"/> <s:errors path="sid"></s:errors><br>
name:<s:input path="name"/> <s:errors path="name"></s:errors><br>

<br>
<input type="submit" value="save"/>


</pre>
</s:form>