<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="u" value="666" scope="request"></c:set>

	<c:if test="${ u==6616}">1</c:if>
	hhhh
	<hr>
	
	<c:choose>
		<c:when test="${age==12 }">
		您的年龄为12岁
		</c:when>
		<c:otherwise>
		您的年龄不为12岁
		</c:otherwise>
	</c:choose>
</body>
</html>