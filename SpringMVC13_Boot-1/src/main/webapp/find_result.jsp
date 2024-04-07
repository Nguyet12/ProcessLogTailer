<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  jstl :: 라이브러리 다운, taglib 선언-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td, h2{
		text-align: center;
	}
	table{
		background-color: yellow;
	}
</style>
</head>
<body>
<h2>+++++++++ 고객정보를 출력합니다 ++++++++++++</h2>
<table border="2" align='center' width="50%">
	<thead>
		<tr>
			<th>아이디</th><th>이름</th><th>주소</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list}"  var="vo">
			<tr>
				<td>${vo.id}</td>
				<td>${vo.name}</td>
				<td>${vo.address}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<p></p>
<center><a href="product.jsp">고객가입하기 홈으로...</a></center>
</body>
</html>






