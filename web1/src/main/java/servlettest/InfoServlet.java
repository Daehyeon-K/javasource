package servlettest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 화면 출력 설정
		response.setContentType("text/html;charset=utf-8");
		
		
		// 폼에서 넘긴 값 가져오기
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String job = request.getParameter("job");
		String favorite[] = request.getParameterValues("favorite");
		String gender = request.getParameter("gender");

		// 화면 출력 메소드
		PrintWriter out = response.getWriter();
		
		// 화면 출력
		out.print("<p>userid : "+userid+"</p>");
		out.print("<p>password : "+password+"</p>");
		out.print("<p>job : "+job+"</p>");
		out.print("<p>favorite : "+Arrays.toString(favorite)+"</p>");
		out.print("<p>gender : "+gender+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
