<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/25
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        $(function(){
            var user = {
                "id" : 1,
                "name" : "张三"
            };
            $.ajax({
                url:"/hello/jsonType",
                data:JSON.stringify(user),
                type:"POST",
                contentType:"application/json;charset=UTF-8",
                dataTypes:"JSON",
                success:function (data){
                    alert(data.id)
                    alert(data.name)
                }
            })
        })
    </script>
</head>
<body>

</body>
</html>
