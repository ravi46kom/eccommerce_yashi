package com.ecom_cart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	private String p_name;
	@Column(length = 3000)
	private String p_desc;
	private String p_photo;
	private String p_price;
	private String p_dis;
	private String p_quantity;
	@ManyToOne
	private Category category;

	/**
	 * Default Constructor
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param p_id
	 * @param p_name
	 * @param p_desc
	 * @param p_photo
	 * @param p_price
	 * @param p_dis
	 * @param p_quantity
	 */
	public Product(int p_id, String p_name, String p_desc, String p_photo, String p_price, String p_dis,
			String p_quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.p_photo = p_photo;
		this.p_price = p_price;
		this.p_dis = p_dis;
		this.p_quantity = p_quantity;
	}

	/**
	 * @param p_name
	 * @param p_desc
	 * @param p_photo
	 * @param p_price
	 * @param p_dis
	 * @param p_quantity
	 * @param category
	 */
	public Product(String p_name, String p_desc, String p_photo, String p_price, String p_dis, String p_quantity,
			Category category) {
		super();
		this.p_name = p_name;
		this.p_desc = p_desc;
		this.p_photo = p_photo;
		this.p_price = p_price;
		this.p_dis = p_dis;
		this.p_quantity = p_quantity;
		this.category = category;
	}

	/**
	 * @return the p_id
	 */
	public int getP_id() {
		return p_id;
	}

	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	/**
	 * @return the p_name
	 */
	public String getP_name() {
		return p_name;
	}

	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	/**
	 * @return the p_desc
	 */
	public String getP_desc() {
		return p_desc;
	}

	/**
	 * @param p_desc the p_desc to set
	 */
	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	/**
	 * @return the p_photo
	 */
	public String getP_photo() {
		return p_photo;
	}

	/**
	 * @param p_photo the p_photo to set
	 */
	public void setP_photo(String p_photo) {
		this.p_photo = p_photo;
	}

	/**
	 * @return the p_price
	 */
	public String getP_price() {
		return p_price;
	}

	/**
	 * @param p_price the p_price to set
	 */
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}

	/**
	 * @return the p_dis
	 */
	public String getP_dis() {
		return p_dis;
	}

	/**
	 * @param p_dis the p_dis to set
	 */
	public void setP_dis(String p_dis) {
		this.p_dis = p_dis;
	}

	/**
	 * @return the p_quantity
	 */
	public String getP_quantity() {
		return p_quantity;
	}

	/**
	 * @param p_quantity the p_quantity to set
	 */
	public void setP_quantity(String p_quantity) {
		this.p_quantity = p_quantity;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	// Tostring method for Product Class
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_desc=" + p_desc + ", p_photo=" + p_photo
				+ ", p_price=" + p_price + ", p_dis=" + p_dis + ", p_quantity=" + p_quantity + "]";
	}

}
