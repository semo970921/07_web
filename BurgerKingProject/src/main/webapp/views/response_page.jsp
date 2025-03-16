<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.kh.burgerking.model.dto.UserDTO" %>
    
<%
	// 스크립트릿 공간
	// 자바 코드 쓸 수 있음 
	
	String message = (String)request.getAttribute("message");
	// String 타입			다형성 적용(String 클래스는 Object 클래스의 자식 클래스이기 때문에 Object클래스의 자료형을 사용할 수 있으므로 Object클래스의 자료형으로 값이 대입됨)
	// HTML의 <p>의 content 영역에다가 출력하고 싶음
	
	
	UserDTO user =	(UserDTO)request.getAttribute("user");

	String userID = user.getUserId();
	String userName = user.getUserName();
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		"사용자가 입력한 userName"님!!
		
		회원가입에 성공하셨습니다~~
		
		가입한 아이디 : userId
	 -->
	 
	 <h1><%= userName %>님!</h1>
	 
	 <p>
	 	<!-- request.getAttribute("message"); -->
	 	
	 	<!-- 화면상에 출력 -->
	 	<%= message %>
	 	회원가입에 성공하셨습니다~~<br><br>
	  	가입에 성공한 아이디 : <%= userID %>
	 </p>

</body>
</html>