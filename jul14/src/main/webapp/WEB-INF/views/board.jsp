<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href="./css/board.css" rel="stylesheet">
</head>
<body>
	<h1>게시판 : ${name }</h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="row">
				<tr>
					<td id="td1">${row.bno}</td>
					<td>
					<a href="./detail?bno=${row.bno }">${row.btitle}</a>
					</td>
					<td id="td1">${row.bwrite}</td>
					<td id="td2">${row.bdate}</td>
					<td id="td1">${row.blike}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>