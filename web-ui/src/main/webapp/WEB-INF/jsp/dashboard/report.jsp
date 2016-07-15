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
    <table border="1">
        <tr>
            <th>Employment ID</th>
            <th>Employee Name</th>
            <th>??</th>
            <th>Created Date</th>
            <th>Start Date</th>
            <th>End Date</th>
        </tr>
        <c:forEach var="employment" items="${employmentList}">
            <tr>
                <td>${employment.identifier}</td>
                <td>${employment.employee.name}</td>
                <td><c:catch var="exception">${employment.employee.embg}</c:catch> <c:catch var="exception">${employment.employee.ssn}</c:catch></td>
                <td>${employment.createdDate}</td>
                <td>${employment.startDate}</td>
                <td>${employment.endDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
