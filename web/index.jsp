<%--
  Created by IntelliJ IDEA.
  User: toanv
  Date: 18/06/2020
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Translation</title>
  </head>
  <body>
  <form action="/translate" method="POST">
    <input type="text" name="search" placeholder="Translate" />
    <button type="submit">Translate</button>
  </form>
  </body>
</html>
