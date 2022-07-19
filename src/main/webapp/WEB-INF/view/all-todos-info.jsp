<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: VagramsMac
  Date: 19.07.2022
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h2>Info for all Todos</h2>
<br>
<br>
<security:authorize access="hasRole('HIGH')">
<input type="button" value="Priority High" onclick="window.location.href='high-info'">
Only for High priority!
</security:authorize>

<br>
<br>
<security:authorize access="hasRole('MIDDLE')">
<input type="button" value="Priority Middle" onclick="window.location.href='middle-info'">
Only for Middle priority!
</security:authorize>
</body>
</html>
