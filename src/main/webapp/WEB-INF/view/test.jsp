<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>MVC视图页面</title>

</head>

<body>
	<div>
		<h1 align="center">MVC视图页面测试</h1>
		<h2>共享数据:
			<c:forEach items="${requestScope.DATA }" var="temp">
				<div>${temp}</div>
			</c:forEach>
		</h2>
	</div>
</body>
</html>
