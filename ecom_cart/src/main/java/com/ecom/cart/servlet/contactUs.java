package com.ecom.cart.servlet;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ecom_cart.entities.Contact;
import com.ecom_cart.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class contactUs
 */
public class contactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public contactUs() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String qst = request.getParameter("queries");

			// User object to store data
			Contact user = new Contact(name, email, mobile, qst);
			Session hsession = FactoryProvider.getFactory().openSession();
			Transaction tx = hsession.beginTransaction();

			hsession.save(user);

			tx.commit();
			hsession.close();

			HttpSession httpSession = request.getSession();

			httpSession.setAttribute("message", "We'll contact You soon !!");
			response.sendRedirect("contactUs.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
