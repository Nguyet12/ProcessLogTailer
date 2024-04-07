<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Customer Register Form...</h2>
<form action="insertCustomer.do" method="post">
아이디 : <input type="text" name="id"><br><br>
이름  : <input type="text" name="name"><br><br>
주소  : <input type="text" name="address"><br><br>

<input type="submit" value="고객 등록">
</form>

+++++++++++++++++++++++++++++++++++++++++++++++++++
<br><br><br>
<h2>고객 검색하기</h2>
<form action="search.do">
	<select name="command">
		<option value="">선택하기</option>
		<option value="findCustomerById">아이디로 검색</option>
	</select>
	
	<input type="text" name="word"><br><br>
	<input type="submit" value="고객 검색">
</form>
</body>
</html>












