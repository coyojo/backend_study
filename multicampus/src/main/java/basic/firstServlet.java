package basic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class firstServlet extends HttpServlet {
//servletŬ������ ��ӹ޾ƾ� �ϴ� Ŭ������ ������ �ִ�. 
//application ó�� main�̶�� �޼��� �ʿ����.
	public void service(HttpServletRequest req, HttpServletResponse res) {
		//HttpServletRequest��ü�� HttpServletResponse ��ü�� Ŭ���̾�Ʈ�� ��û�� ������ ó���ϱ� ���� ��ü�� 
		//Ŭ���̾�Ʈ�� ��û�� ������ Ŭ���̾�Ʈ�� ������ ������ ������ ��ü�� ���� service�޼ҵ带 ȣ���Ҷ� �����Ѵ�.
		System.out.println("FirstServlet����. .");
	}

}
