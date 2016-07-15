<%--
  Created by IntelliJ IDEA.
  User: Bubo
  Date: 7/15/2016
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="employment" items="${employmentList}">
        <p>${employment.identifier}</p>
        <p>${employment.employee.name}</p>
        <p>${employment.createdDate}</p>
        <p>${employment.startDate}</p>
        <p>${employment.endDate}</p>
    </c:forEach>
</body>
</html>
