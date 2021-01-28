<%--
  Created by IntelliJ IDEA.
  User: 82412
  Date: 2021/1/25
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基于dubbo版本号的不同用户信息</title>
</head>
<body>
    <h3>用户1</h3>
    <div>用户编号：${user1.id}</div>
    <div>用户姓名：${user1.name}</div>
    <div>用户年龄：${user1.age}</div>

    <h3>用户2</h3>
    <div>用户编号：${user2.id}</div>
    <div>用户姓名：${user2.name}</div>
    <div>用户年龄：${user2.age}</div>

</body>
</html>
