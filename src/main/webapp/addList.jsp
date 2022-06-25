<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/25
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/listType" method="post">
        用户1ID：<input type="text" name="users[0].id"><br>
        用户1name：<input type="text" name="users[0].name"><br>
        用户2ID：<input type="text" name="users[1].id"><br>
        用户2name：<input type="text" name="users[1].name"><br>
        用户3ID：<input type="text" name="users[2].id"><br>
        用户3name：<input type="text" name="users[2].name"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
