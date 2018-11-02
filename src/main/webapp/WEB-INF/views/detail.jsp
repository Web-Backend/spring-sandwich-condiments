<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 11/2/18
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <%
        String[] condiments = (String[]) request.getAttribute("condiments");
        for (String condiment : condiments) {
            %>
    <h1><%=condiment%></h1>
    <%
        }
    %>
</h1>
</body>
</html>
