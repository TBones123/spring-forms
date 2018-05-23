<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Radus
  Date: 21.05.2018
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<%--hello world--%>
<%--<form action="/save/user" method="post">--%>
    <%--<input type="text" name="name" placeholder="name">--%>
    <%--<input type="submit">--%>
<%--</form>--%>
<%--<form action="/save/product" method="post">--%>
    <%--<input type="text" name="assortment" placeholder="assortment">--%>
    <%--<input type="submit">--%>
<%--</form>--%>

<sf:form action="/save/user" method="post" modelAttribute="userModel">
    <sf:input path="name"/>
    <sf:errors path="name"/>
    <input type="submit">
</sf:form>

<sf:form action="/save/product" method="post" modelAttribute="productModel">
    <sf:input path="assortment"/>
    <input type="submit">
</sf:form>




































</body>
</html>
