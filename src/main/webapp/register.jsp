<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/29
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户注册</h1>
    <form:form modelAttribute="account" action="/validate/register" method="post">
        用户名：<form:input path="username" /><form:errors path="username"/><br/>
        密码：<form:input path="password" /><form:errors path="password"/><br/>
        邮箱：<form:input path="email" /><form:errors path="email"/><br/>
        电话：<form:input path="phone" /><form:errors path="phone"/><br/>
        <input type="submit" value="提交" />
    </form:form>
</body>
</html>
