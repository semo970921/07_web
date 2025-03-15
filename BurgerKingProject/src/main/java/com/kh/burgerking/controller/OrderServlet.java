package com.kh.burgerking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public OrderServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("/bk/order doGet 메서드 호출됨!");
		
		// 사용자가 입력한 수량 x 500 해야됨
		
//		String queryString=request.getQueryString();
//		System.out.println(queryString);
//		
		int num = Integer.parseInt(request.getParameter("num"));
		// int 타입		String 타입
		System.out.println(num);
		/*
		 * [num에 입력을 안 했을 경우 => 500]
		 * 
		 * * 자주 보는 문제 상황 상태코드
		 * 404 : 파일이나 요청을 받아주는 서블릿을 찾지 못했을 때 발생
		 * 		=> 오타일 확률이 높음
		 * 
		 * 500 : 자바 소스코드상의 오류(예외발생)
		 */
		String productName=request.getParameter("product-name");
		System.out.println(productName);
		
		// 잘 다녀옴 -> Insert 했다고 침
		/*
		 * 요청처리(Service의 메서드를 호출해서 DB와의 상호작용까지 끝난 상태)
		 * 
		 * 얼렁뚱땅 다 끝남(요청처리 성공)
		 */
		
		int totalPrice = num * 500;
		
		
		/* 이제 HTML에 보여야 함
		 * 제품명(사용자가 입력한 제품명)의 총 가격은 XXX원(총 결제해야 하는 금액) 입니다.
		 */
		
		// 1단계
		response.setContentType("text/html; charset=UTF-8");
		
		// 2단계
		PrintWriter writer = response.getWriter();
		
		// 3단계
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>으흐흐흐 GET 방식 입니당</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.printf("%s의 총 가격은 %d입니다.", productName, totalPrice);
		
		writer.println("<script>");
		writer.println("alert('축하👻')");
		writer.println("</script>");
		
		
		writer.println("</body>");
		writer.println("</html>");

		// 비즈니스 로직과 프레젠테이션 로직이 합쳐져 있다 => 단일 책임 원칙 위반
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/bk/order/ doPost 메서드 호출됨!");
	}

}
