<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
  </head>
  <body>
    <div>
      <form action="test.do" method="get">
	    <input type="hidden" name="method" value="1">
        <input type="hidden" name="username" value="test1">
		<input type="hidden" name="password" value="test1">
        <input type="submit" value="sub1">
      </form>
      <form action="test.do" method="get">
      	<input type="hidden" name="method" value="2">
        <input type="submit" value="count">
      </form>
    </div>
  </body>
</html>