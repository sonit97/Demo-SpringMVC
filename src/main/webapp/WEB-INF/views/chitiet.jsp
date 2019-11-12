<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<title>Insert title here</title>
</head>
<body>
 <c:out value="${NAME}"/>
 <h4>${NAME}</h4>
 <h4>${NAME1}</h4>
<h3>This is page detail</h3>
	<h4>${nv.getTenNhanVien()}</h4>
	<h4>${nv.getDiaChi()}</h4>
</body>
</html>