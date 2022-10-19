package com.ecom.cart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.ecom_cart.dao.UserDao;
import com.ecom_cart.entities.User;
import com.ecom_cart.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter pw = response.getWriter()) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");

			UserDao dao = new UserDao(FactoryProvider.getFactory());
			User user = dao.getUserByEmailAndPassword(email, pass);

			HttpSession httpSession = request.getSession();
			if(user == null) {
				httpSession.setAttribute("message", "Invalid Details !! Try with another one !!");

				response.sendRedirect("signin.jsp");
				return;
			}
			httpSession.setAttribute("current-user",user);
			response.sendRedirect("dashboard.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
