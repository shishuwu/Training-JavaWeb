package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorldServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Override
	// public void init() throws ServletException {
	// System.out.println("Init...");
	// }
	//
	//
	// @Override
	// public void destroy() {
	// System.out.println("Destory...");
	// }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		System.out.println("asdfasdf");

		String name = request.getParameter("name");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		for (int i = 0; i < 100; i++) {
			out.println(name);
		}

		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpSession session = request.getSession();
		// Object name = session.getAttribute("username");
		String name = request.getParameter("username");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (name.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			out.println(name + " has logged in");
		} else {
			out.print("Error! <a href='index.html'>login</a>");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
