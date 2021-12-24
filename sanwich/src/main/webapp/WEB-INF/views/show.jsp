<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LAPTOP T&T
  Date: 12/23/2021
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>show ${id}</h3>
<ul>
    <c:forEach var="c" items="${condimen}">
        <li>
            <c:out value="${c}"/>
        </li>
    </c:forEach>
</ul>
</body>
</html>
