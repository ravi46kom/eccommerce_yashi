package com.ecom.cart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ecom_cart.entities.User;
import com.ecom_cart.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter pw = response.getWriter()) {

			try {
				String f_name = request.getParameter("f_name") + " " + request.getParameter("l_name");
				String email = request.getParameter("email");
				String pass = request.getParameter("u_pass");
				String gender = request.getParameter("gender");
				String mobile = request.getParameter("mobile");
				String city = request.getParameter("u_dist");
				String state = request.getParameter("u_state");
				int pin = Integer.parseInt(request.getParameter("pin"));

				// User object to store data
				User user = new User(f_name, email, pass, mobile, "default.jpg", city, state, gender, pin);
				Session hsession = FactoryProvider.getFactory().openSession();
				Transaction tx = hsession.beginTransaction();

				int userid = (int) hsession.save(user);

				tx.commit();
				hsession.close();

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("message", "Registration Succesfull !! Id : " + userid);
				response.sendRedirect("register.jsp");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		processRequest(request, response);
	}

}
