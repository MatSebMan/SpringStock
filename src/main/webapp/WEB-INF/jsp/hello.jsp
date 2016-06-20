<%-- 
    Document   : hello
    Created on : 07/06/2016, 20:52:09
    Author     : matse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%--link rel="stylesheet" type="text/css" href="stylesheet.css"--%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title"/></title>
    </head>
    <body>
        <h1><fmt:message key="heading"/></h1>
        <p>
            <fmt:message key="greeting"/>
            <c:out value="${model.now}"/>
        </p>
        <h3>Products</h3>
        <c:forEach items="${model.products}" var="prod">
            <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
        </c:forEach>
        <%--pComment>
            <i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.
        </pComment--%>
    </body>
</html>