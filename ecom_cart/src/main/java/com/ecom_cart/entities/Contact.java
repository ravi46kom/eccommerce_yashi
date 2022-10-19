package com.ecom_cart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Contact {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(length = 100, name = "user_name")
	private String name;
	private String email;
	private String phone;
	private String qst;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param u_name
	 * @param u_email
	 * @param u_phone
	 * @param qst
	 */
	public Contact(int id, String u_name, String u_email, String u_phone, String qst) {
		super();
		this.Id = id;
		this.name = u_name;
		this.email = u_email;
		this.phone = u_phone;
		this.qst = qst;
	}

	/**
	 * @param u_name
	 * @param u_email
	 * @param u_phone
	 * @param qst
	 */
	public Contact(String u_name, String u_email, String u_phone, String qst) {
		super();
		this.name = u_name;
		this.email = u_email;
		this.phone = u_phone;
		this.qst = qst;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * @return the u_name
	 */
	public String getU_name() {
		return name;
	}

	/**
	 * @param u_name the u_name to set
	 */
	public void setU_name(String u_name) {
		this.name = u_name;
	}

	/**
	 * @return the u_email
	 */
	public String getU_email() {
		return email;
	}

	/**
	 * @param u_email the u_email to set
	 */
	public void setU_email(String u_email) {
		this.email = u_email;
	}

	/**
	 * @return the u_phone
	 */
	public String getU_phone() {
		return phone;
	}

	/**
	 * @param u_phone the u_phone to set
	 */
	public void setU_phone(String u_phone) {
		this.phone = u_phone;
	}

	/**
	 * @return the qst
	 */
	public String getQst() {
		return qst;
	}

	/**
	 * @param qst the qst to set
	 */
	public void setQst(String qst) {
		this.qst = qst;
	}

	@Override
	public String toString() {
		return "ContactUsUSer [id=" + Id + ", u_name=" + name + ", u_email=" + email + ", u_phone=" + phone + ", qst="
				+ qst + "]";
	}

}
