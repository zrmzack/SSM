<%--
  Created by IntelliJ IDEA.
  User: ZRM
  Date: 2020/1/6
  Time: 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script>
        $(function(){
            $("#btn").click(function(){
                //alert("hello btn");
                //发送Ajax
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=utf-8",
                    data:'{"username":"hehe","password":"123","age":"30"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        
                    }
                });
            });
        });
    </script>
</head>
<body>
<a href="user/testString"> testString</a><br>
<a href="/user/testVoid">testVoid</a>
<a href="/user/testAjax">AJAX</a>
<br/>
<button id="btn"> 按钮</button>
</body>
</html>
