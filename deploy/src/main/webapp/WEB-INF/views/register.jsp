<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	
	
	<form action="${pageContext.request.contextPath }/register" method="post">
	
		<div>
			<label for="name">NAME</label>
			<input type="text" id="name" name="name" placeholder="이름 입력" />
		</div>
		<div>
			<label for="age">AGE</label>
			<input type="number" id="age" name="age" placeholder="나이 입력" />
		</div>
		<div>
			<label for="hobby">HOBBY</label>
			<input type="text" id="hobby" name="hobby" placeholder="취미 입력" />
		</div>
		<div>
			<input type="submit" value="등록하기" />
		</div>
	</form>
</body>
</html>