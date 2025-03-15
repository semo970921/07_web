package com.kh.burgerking.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.burgerking.model.dto.UserDTO;


@WebServlet("/sign-up.do") 
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUpController() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("POST에서 나를 부름");
		
		/*
		 * 컨트롤러
		 * 
		 * 1. request 객체로부터 값을 뽑아서 DTO로 가공
		 * 2. 요청 처리 -> 패스
		 * 3. VIEW 처리
		 */
		
		// 1단계
		request.setCharacterEncoding("UTF-8");
		
		// 2단계
		String userId= request.getParameter("userId");
		System.out.println(userId);
		String userPw = request.getParameter("userPw");
		System.out.println(userPw);
		String userName = request.getParameter("userName");
		System.out.println(userName); 
		// model.dto.UserDTO => 내가 전송한 값을 담을 수 있도록 필드 구성해야 함
		
		// 3단계
		UserDTO user = new UserDTO(userId, userPw,userName);
		
		// service.insertMember(user); 
		// 잘 다녀왔다고 가정
		//service -> DAO -> DB
		// int 반환
		
		// 4단계
		// Attribute : key : value 세트로 뭈어서 값을 담을 수 있음
		request.setAttribute("user", user);
		request.setAttribute("message","요청 처리에 성공했습니다.");
		
		
		// 5단계
		// JSP를 이용해서 응답 데이터 만들기
		// response_page.jsp
		// 응답 페이지를 JSP에게 위임(배정)
		RequestDispatcher view = request.getRequestDispatcher("/views/response_page.jsp");
		
		// view // request, response
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("진짜로 내가 호출됨???진짜임??");
		doGet(request, response);
	}

}
