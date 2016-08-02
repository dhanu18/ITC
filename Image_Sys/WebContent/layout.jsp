<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

</style>
</head>
<body>

		<div><tiles:insertAttribute name="header" /></div><br>
		<div  style="float:left;width: 15%"><tiles:insertAttribute name="menu" /></div>
		<center><div style=" width: 65%;">
		<tiles:insertAttribute name="body" /></div></center><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    	<div><tiles:insertAttribute name="footer" /></div>

</body>
</html>
