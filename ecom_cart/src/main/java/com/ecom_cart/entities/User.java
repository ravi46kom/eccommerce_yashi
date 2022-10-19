package com.ecom_cart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author hp
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 100, name = "user_id")
	int u_id;
	@Column(length = 100, name = "user_name")
	private String u_name;
	private String u_email;
	private String u_pass;
	@Column(length = 12)
	private String u_phone;
	private String u_pic;
	private String u_city;
	private String u_state;
	private String gender;
	@Column(length = 6)
	private int u_pin;

	/**
	 * Default constructor
	 */
	public User() {
		super();
	}

	/**
	 * Constructor using all field
	 *
	 * @param u_id
	 * @param u_name
	 * @param u_email
	 * @param u_pass
	 * @param u_phone
	 * @param u_pic
	 * @param u_city
	 * @param u_state
	 * @param u_pin
	 */

	// Calling toString Method
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_email=" + u_email + ", u_pass=" + u_pass
				+", gender=" + gender+ ", u_phone=" + u_phone + ", u_pic=" + u_pic + ", u_city=" + u_city + ", u_state=" + u_state
				+ ", u_pin=" + u_pin + "]";
	}

	/**
	 * @return the queries
	 */


	/**
	 * @param u_name
	 * @param u_email
	 * @param u_phone
	 * @param queries
	 */


	/**
	 * @param u_id
	 * @param u_name
	 * @param u_email
	 * @param u_pass
	 * @param u_phone
	 * @param u_pic
	 * @param u_city
	 * @param u_state
	 * @param gender
	 * @param u_pin
	 */
	public User(int u_id, String u_name, String u_email, String u_pass, String u_phone, String u_pic, String u_city,
			String u_state, String gender, int u_pin) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_pass = u_pass;
		this.u_phone = u_phone;
		this.u_pic = u_pic;
		this.u_city = u_city;
		this.u_state = u_state;
		this.gender = gender;
		this.u_pin = u_pin;
	}

	/**
	 * @param u_name
	 * @param u_email
	 * @param u_pass
	 * @param u_phone
	 * @param u_pic
	 * @param u_city
	 * @param u_state
	 * @param gender
	 * @param u_pin
	 */
	public User(String u_name, String u_email, String u_pass, String u_phone, String u_pic, String u_city,
			String u_state, String gender, int u_pin) {
		super();
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_pass = u_pass;
		this.u_phone = u_phone;
		this.u_pic = u_pic;
		this.u_city = u_city;
		this.u_state = u_state;
		this.gender = gender;
		this.u_pin = u_pin;
	}

	/**
	 * @return the u_id
	 */
	public int getU_id() {
		return u_id;
	}

	/**
	 * @param u_id the u_id to set
	 */
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	/**
	 * @return the u_name
	 */
	public String getU_name() {
		return u_name;
	}

	/**
	 * @param u_name the u_name to set
	 */
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	/**
	 * @return the u_email
	 */
	public String getU_email() {
		return u_email;
	}

	/**
	 * @param u_email the u_email to set
	 */
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	/**
	 * @return the u_pass
	 */
	public String getU_pass() {
		return u_pass;
	}

	/**
	 * @param u_pass the u_pass to set
	 */
	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}

	/**
	 * @return the u_phone
	 */
	public String getU_phone() {
		return u_phone;
	}

	/**
	 * @param u_phone the u_phone to set
	 */
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	/**
	 * @return the u_pic
	 */
	public String getU_pic() {
		return u_pic;
	}

	/**
	 * @param u_pic the u_pic to set
	 */
	public void setU_pic(String u_pic) {
		this.u_pic = u_pic;
	}

	/**
	 * @return the u_city
	 */
	public String getU_city() {
		return u_city;
	}

	/**
	 * @param u_city the u_city to set
	 */
	public void setU_city(String u_city) {
		this.u_city = u_city;
	}

	/**
	 * @return the u_state
	 */
	public String getU_state() {
		return u_state;
	}

	/**
	 * @param u_state the u_state to set
	 */
	public void setU_state(String u_state) {
		this.u_state = u_state;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the u_pin
	 */
	public int getU_pin() {
		return u_pin;
	}

	/**
	 * @param u_pin the u_pin to set
	 */
	public void setU_pin(int u_pin) {
		this.u_pin = u_pin;
	}

}
