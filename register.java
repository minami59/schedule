package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		String name=req.getParameter("name");
		
		if(name==null || name.trim().isEmpty()) {
			out.println("<html>");
			out.println("<body background=\"sutarehaikei.jpg\">");
			out.println("<body>");
			out.println("<h1>あああああああああ</h1>");
			out.println("</body>");
			out.println("</html>");
		}else {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>確認画面</title>");
			out.println("</head>");
			out.println("<body background=\"sutarehaikei.jpg\">");
			out.println("<h1>名前あってますか？ほんとにそれでいいの？</h1>");
			out.println("名前：<strong>"+req.getParameter("name")+"</strong><br/>");
			out.println("<input type=\"submit\" value=\"登録\" />");
			out.println("<input type=\"reset\" value=\"戻る\" />");
			out.println("</html>");
		}
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}
}
