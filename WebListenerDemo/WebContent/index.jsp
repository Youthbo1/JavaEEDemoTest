<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>监听器Demo</title>
</head>
<body>
	<h1>首页</h1>
	<label>
		<span>ServletRequestListener测试</span>
		<a href="servlet_request.jsp?par=request_par" target="_blank">初始化</a>	
	</label>
	
	<br/>
	
	<label>
		<span>AttributeListener测试</span>
		<a href="attribute_init.jsp" target="_blank">属性初始化</a>	
		<a href="attribute_replace.jsp" target="_blank">属性修改</a>
		<a href="attribute_remove.jsp" target="_blank">属性移除</a>
	</label>
	
	<br/>
	
  	<label>
		<span>BindingListener测试</span>
		<a href="bound.jsp" target="_blank">绑定测试</a>
		<a href="unbound.jsp" target="_blank">解绑测试</a>
	</label>
	
</body>
</html>