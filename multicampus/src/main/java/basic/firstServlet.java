package basic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstServlet extends HttpServlet {
//servlet클래스는 상속받아야 하는 클래스가 정해져 있다. 
//application 처럼 main이라는 메서드 필요없다.
	public void service(HttpServletRequest req, HttpServletResponse res) {
		//HttpServletRequest객체와 HttpServletResponse 객체는 클라이언트의 요청과 응답을 처리하기 위한 객체로 
		//클라이언트가 요청한 내용을 클라이언트에 응답할 내용을 서버가 객체로 만들어서 service메소드를 호출할때 전달한다.
		System.out.println("FirstServlet실행. .");
	}

}
