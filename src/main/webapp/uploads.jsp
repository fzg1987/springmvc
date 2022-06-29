<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/28
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/file/uploads" method="post" enctype="multipart/form-data">
        file1:<input type="file" name="imgs"/><br/>
        file2:<input type="file" name="imgs"/><br/>
        file3:<input type="file" name="imgs"/><br/>
        <input type="submit" value="提交" />
    </form>
    <c:forEach items="${list}" var="path">
        <img width="300px" src="${path}">
    </c:forEach>
</body>
</html>
