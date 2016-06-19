<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <c:forEach var="employee" items="${employees}">
            <li>
                <td><c:out value="${employee.name}"/></td>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
