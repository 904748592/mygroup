<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>123</title>
<script type="text/javascript">
// 	var list = ${users};
</script>
</head>
<body>
	<c:forEach items="${users}" var="item">  
        ${item.id }--${item.username }--${item.usercode }<br />
	</c:forEach>
	<div style="padding:20px;">${pageStr}</div>
</body>
</html>