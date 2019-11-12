<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
 <c:out value="${NAME}"/>
<hr/>
	<a href="/TestShop/test?12" id="theA">Go to detail page!!</a>
	<a href="chitiet" id="theA">Go to detail page!!</a>
	<a href="dangnhap/" id="theA">Go to login page!!</a>
	<form action="chitiet" method="post">
		<input type="text" name="tenNhanVien" /> 
		<input type="text"
			name="diaChi" /> <input type="submit" />
	</form>
</body>
</html>
