<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Wynk Movies

 <a href="<%=request.getContextPath() %>/temp/default">Test me</a>
  <table border="1"> 
<tr>
<td>Content Provider</td>
<td>Action</td>
</tr>
<tr>
<td>HOOQ</td>
<td><a href="<%=request.getContextPath() %>/hooq">Ingestion</a></td>
</tr>
<tr>
<td>EROSNOW</td>
<td><a href="<%=request.getContextPath() %>/erosnow">Ingestion</a></td>
</tr>
<tr>
<td>YOUTUBE</td>
<td><a href="<%=request.getContextPath() %>/youtube">Ingestion</a></td>
</tr>
<tr>
<td>SONYLIV</td>
<td><a href="<%=request.getContextPath() %>/sony">Ingestion</a></td>
</tr>
<tr>
<td>DAILYMOTION</td>
<td><a href="<%=request.getContextPath() %>/dailymotion">Ingestion</a></td>
</tr>
</body>
</html>