<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: Тарасов Александр
  Date: 18.04.2023
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Два</title>
</head>
<body>
<jsp:useBean id="mybean" scope="session" class="com.example.demo.MainBean"/>
<header>
  <nav>
    <li><a href="StartPage.jsp">Раз</a></li>
    <li><a href="MainPage.jsp">Два</a></li>
    <li><a href="FinishPage.jsp">Три</a></li>
  </nav>
</header>
<main>
  <h1>Введите входные параметры для функции: </h1>
  <form name="Input form" action="FinishPage.jsp">
    <input type="text" name="args" />
    <input type="submit" value="OK" name="button" />
  </form>
</main>
<h3>Счетчик на главной странице: ${mybean.countPageRefresh}</h3>
<%
  mybean.setCountPageRefresh(mybean.getCountPageRefresh() + 1);
%>
<h3>Тригер на главной странице: ${mybean.trigger}</h3>
<%
  mybean.setTrigger(!mybean.isTrigger());
%>

</body>
</html>
