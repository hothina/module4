<%--
  Created by IntelliJ IDEA.
  User: LAPTOP T&T
  Date: 12/23/2021
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Condiments</title>
  </head>
  <body>
  <h3>Sandwich Condiments</h3>
  <form action="/sandwich/save" method="get" >
    <input type="checkbox" value="Lettuce" name="condimen"> Lettuce
    <input type="checkbox" value="Tomato" name="condimen">Tomato
    <input type="checkbox" value="Mustader" name="condimen">Mustader
    <input type="checkbox" value="Sprouts" name="condimen">Sprouts
    <hr>
    <button type="submit">save</button>
  </form>

  </body>
</html>
