<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<strong>ex1.jsp입니다.</strong>

<script>
	// 빈 배열
	var arr = [];
	
	arr[0] = 3;
	arr[1] = 2;
	arr[2] = 1;
	
	console.log(arr[0]);
	console.log(arr[1]);
	console.log(arr[2]);
	
</script>

<script>
	function gugudan (c) {
		for (var i = 1; i < 10; i++) {
			console.log(c + " * " + i + " = " + (c*i));
		}
	}
	// prompt를 사용해서 사용자로부터 2~9 사이의 숫자를 입력받아
	// 해당하는 숫자의 구구단을 console.log로 출력
	
	var c = prompt("2 ~ 9 사이의 숫자를 입력해 주세요.");
	gugudan(c)
	
</script>


<script>
	// prompt를 사용해서 사용자로부터 숫자를 입력받아
	// 짝수를 입력받았을 경우 alert를 사용해서 짝수입니다 출력
	// 홀수를 입력받았을 경우 alert를 사용해서 홀수입니다 출력
	var b = prompt("정수를 입력하세요");
	
	if(b%2 == 0) {
		alert("짝수입니다.");
	} else {
		alert("홀수입니다.");
	}
	
	
// 	var a = 10;
// 	console.log("a = " + a);
	
// 	a = 3.14;
// 	console.log("a = " + a);
	
// 	a = "문자열";
// 	console.log("a = " + a);
	
// 	var str = prompt("아무 값이나 입력하세요.");
	
// 	alert("사용자가 입력한 값은" + str + "입니다.");
</script>
</body>
</html>