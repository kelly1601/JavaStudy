<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<!-- 입력 양식을 묶어서 보내는 form 태그 -->
		<!-- 폼 태그 안에는 입력 가능한 태그들을 작성 -->
		<!-- 폼 태그가 입력한 데이터를 서버로 보내줌 -->
		
		<p>아이디: <input type="text" name="id"> <input type="button" value="아이디 중복 검사"></p>
		<p>비밀번호: <input type="password" name="pw"></p>
		<p>비밀번호: <input type="password" name="pw2"></p>
		<p>이름: <input type="text" name="name"></p>
		<p>연락처: <input type="number" name="phone1">-<input type="number" name="phone2">-<input type="number" name="phone3"></p>
		<p>성별: <input type="radio" name="gender" value="남성">남성
				<input type="radio" name="gender" value="여성">여성</p>
		<p>취미: 독서<input type="checkbox" name="hobby1">
				운동<input type="checkbox" name="hobby1">
				영화<input type="checkbox" name="hobby1">
				</p>
		<p><input type="submit" value="전송"><input type="reset" value="다시 쓰기"></p>
	
	</form>

</body>
</html>