<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm">
		<p>이름: <input type="text" name="name"></p>
		<p>아이디: <input type="text" name="u_id1"></p>
		<p>비밀번호: <input type="password" name="u_pw1"></p>
		<p>비밀번호 확인: <input type="password" name="u_pw2"></p>
		<input type="submit" value="전송" onclick="checkForm()">
	
	</form>
	
<script>
	// 전송버튼을 눌렀을 때 이름, 아이디, 비밀번호, 비밀번호 확인 모두 입력되었는지 확인하세요.
	// 입력되지 않았을 때는 (해당 항목)을 입력해 주세요 출력 후 해당 항목으로 포커스
	
	// 아이디는 4자 이상 12자 이하
	// 비밀번호는 8자 이상 16자 미만
	// 비밀번호 확인은 비밀번호와 일치
	function checkForm() {
		var uname = document.loginForm.name.value;
		var u_id = document.loginForm.u_id1.value;
		var u_pw = document.loginForm.u_pw1.value;
		var u_pwc = document.loginForm.u_pw1c.value;
		
		if(uname == "") {
			alert("이름을 입력하세요.");
			document.loginForm.name.focus();
			return false;
		} else if(uname.length < 6 || uname.length > 14) {
			alert("이름을 6~14자 이내로 입력해 주세요.");
			document.loginForm.name.select();
			return false;
		}

		if(u_id == "") {
			alert("아이디를 입력하세요.");
			document.loginForm.u_id.focus();
			return false;
		} else if(u_id.length < 4 || u_id.length > 12) {
			alert("아이디를 4~12자 이내로 입력해 주세요.");
			document.loginForm.u_id.select();
			return false;
		}
		
		if(u_pw == "") {
			alert("비밀번호를 입력하세요.");
			document.loginForm.u_pw.focus();
			return false;
		} else if(u_pw.length < 8 || u_pw.length >= 16) {
			alert("비밀번호를 8~15자 이내로 입력해 주세요.");
			document.loginForm.u_pw.select();
			return false;
		
		if(u_pwc == "") {
			alert("비밀번호 확인을 입력하세요.");
			document.loginForm.u_pw.focus();
			return false;
		} else if(u_pwc != u_pw) {
			alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
			document.loginForm.u_pwc.select();
			return false;
		} else {
			alert("이름: " + uname + "\n아이디: " + u_id + "\n비밀번호: " + u_pw);
			alert("제대로 입력했으므로 입력한 값을 서버로 보냅니다.");
		}
	}
</script>
</body>
</html>