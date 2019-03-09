<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
  <form:form method="post" commandName="stCmd">
      Name:<form:input path="sname"/>
      Addrs:<form:input path="addrs"/>
      Course:<form:input path="course"/>
      Hobbies:<form:input path="hobbies"/>
      Qualify:<form:input path="qlfy"/>
      <input type="submit" name="register">
  </form:form>
  
  <br> ${result}
</body>
</html>