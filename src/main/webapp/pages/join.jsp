<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Radus
  Date: 23.05.2018
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>join</title>
</head>
<body>

<sf:form action="/save/product/user" method="post" modelAttribute="productModel">
    
    <sf:input path="assortment"/>
    <sf:select path="user">
               <c:forEach items="${users}" var="user">
                   <sf:option value="${user.id}">
                       ${user.name}
                   </sf:option>
               </c:forEach>
    </sf:select>
</sf:form>
</body>
</html>
