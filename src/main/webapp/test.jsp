<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/27
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/rest/update" method="post">
    <input type="hidden" name="_method" value="PUT" />
    <input type="submit" value="PUT提交" />
</form>

<form action="/rest/delete" method="post">
    <input type="hidden" name="_method" value="DELETE" />
    <input type="submit" value="DELETE提交" />
</form>

</body>
</html>
