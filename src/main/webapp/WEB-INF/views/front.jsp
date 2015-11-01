<%--
  Created by IntelliJ IDEA.
  User: zwshao
  Date: 11/1/15
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="/upload" method="post" enctype="multipart/form-data">
    please input file : <input type="file" name="file"/>
    <input type="submit" value="upload"/>
  </form>
</body>
</html>
