<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>email</title>
</head>
<body>
<h3>Settings</h3>


<form:form modelAttribute="email" method="POST" action="update"  >
    Languages: <form:select path="language" items="${listLanguage}" />
    <br>
    <br>
    Page Size :   Show <form:select path="pageSize" items="${integerList}" /> email per page
    <br>
    <br>
    <input type="submit" value="update"/>
</form:form>
</body>
</html>
