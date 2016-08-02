<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="l" items="${list}">
${l.sid} 
${l.name} 
</c:forEach>