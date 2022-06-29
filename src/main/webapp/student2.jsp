<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/29
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>修改学生信息</h1>
    <form action="/student/update" method="post">
        学生编号：<input type="text" name="id" value="${student.id}" readonly /><br/>
        学生姓名：<input type="text" name="name" value="${student.name}" /><br/>
        学生年龄：<input type="text" name="age" value="${student.age}" /><br/>
        学生性别：<input type="text" name="gender" value="${student.gender}" /><br/>
        <input type="submit" name="提交" />
    </form>
    <hr/>
    <form:form modelAttribute="student" action="/student/update" method="post">
        学生编号：<form:input path="id"/><br/>
        学生姓名：<form:input path="name"/><br/>
        学生密码：<form:password path="password"/><br/>
        学生年龄：<form:input path="age"/><br/>
        学生性别：<form:input path="gender"/><br/>
        学生地址：<form:input path="address.value"/><br/>
        checkbox：<form:checkbox path="flag" value="1"/><br/>
<%--        <form:checkbox path="hobby" value="读书"/>读书<br/>--%>
<%--        <form:checkbox path="hobby" value="看电影"/>看电影<br/>--%>
<%--        <form:checkbox path="hobby" value="玩手机"/>玩手机<br/>--%>
<%--        <form:checkbox path="hobby" value="旅游"/>旅游<br/>--%>
<%--        <form:checkbox path="hobby" value="打游戏"/>打游戏<br/>--%>
        <form:checkboxes path="selectHobby" items="${student.hobby}"/><br/>
        <form:radiobutton path="radioId" value="0"/>男
        <form:radiobutton path="radioId" value="1"/>女
        <form:radiobuttons path="selectGrade" items="${student.gradeMap}"/><br/>
<%--        学生城市：<form:select path="selectCity" items="${student.cityMap}"/>--%>
<%--        <form:select path="selectCity">--%>
<%--            <form:options items="${student.cityMap}"/>--%>
<%--        </form:select>--%>
        <form:select path="selectCity">
            <form:option value="1">苏州</form:option>
            <form:option value="2">成都</form:option>
            <form:option value="3">杭州</form:option>
        </form:select>
        <input type="submit" name="提交" />
    </form:form>
</body>
</html>
