<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Title</title>

    <!-- Bootstrap -->
    <link href="<c:url value="style/bootstrap.css" />" rel="stylesheet">

</head>
<body>
<ul>
    <c:forEach var="employee" items="${employees}">
        <li><c:out value="${employee.name}"/></li>

        <c:catch var="exception">${employee.embg}</c:catch>

        <c:catch var="exception">${employee.ssn}</c:catch>

    </c:forEach>
</ul>
<p>Create a MK Employee</p>
<form action="create-employee-mk" method="post">
    <input type="text" name="name">
    <input type="text" name="embg">
    <button type="submit">Submit</button>
</form>

<p>Create a US Employee</p>
<form action="create-employee-us" method="post">
    <input type="text" name="name">
    <input type="text" name="ssn">
    <button type="submit">Submit</button>
</form>
</body>
</html>
