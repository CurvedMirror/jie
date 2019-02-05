<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/3
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>nihao</title>
</head>
<body>
我的天<a href="helloServlet">点我跳转</a>
</body>
</html>
