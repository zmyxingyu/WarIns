<%@ page language="java" contentType="text/html; charset=UTF-8"
            pageEncoding="UTF-8" isELIgnored ="false" %>
<% Integer count = (Integer)request.getAttribute("count"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
  </head>
  <body>
    <h1>Message :${count}</h1>
  </body>
</html>
