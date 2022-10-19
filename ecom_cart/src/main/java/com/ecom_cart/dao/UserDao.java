package com.ecom_cart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ecom_cart.entities.User;

public class UserDao {
	private SessionFactory factory;

	public UserDao(SessionFactory factory) {
		this.factory = factory;
	}

	// get user by email and password
	public User getUserByEmailAndPassword(String email, String password) {
		User user = null;
		try {
			String query = "from User where u_email =: e and u_pass =: p";
			Session session = this.factory.openSession();
			Query qry = session.createQuery(query);
			qry.setParameter("e", email);
			qry.setParameter("p", password);
			user = (User) qry.uniqueResult();

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
