package com.ecom_cart.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String c_title;
	private String c_discription;
	@OneToMany(mappedBy = "category")
	private List<Product> product = new ArrayList<Product>();

	/**
	 * Default Costructor
	 */
	public Category() {
		super();
	}
	
	

	/**
	 * @param c_id
	 * @param c_title
	 * @param c_discription
	 */
	public Category(int c_id, String c_title, String c_discription) {
		super();
		this.c_id = c_id;
		this.c_title = c_title;
		this.c_discription = c_discription;
	}

	/**
	 * Constructor without auto increment variable
	 * 
	 * @param c_title
	 * @param c_discription
	 */
	public Category(String c_title, String c_discription, List<Product> product) {
		super();
		this.c_title = c_title;
		this.c_discription = c_discription;
		this.product = product;
	}

	/**
	 * @return the c_id
	 */
	public int getC_id() {
		return c_id;
	}

	/**
	 * @param c_id the c_id to set
	 */
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	/**
	 * @return the c_title
	 */
	public String getC_title() {
		return c_title;
	}

	/**
	 * @param c_title the c_title to set
	 */
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	/**
	 * @return the c_discription
	 */
	public String getC_discription() {
		return c_discription;
	}

	/**
	 * @param c_discription the c_discription to set
	 */
	public void setC_discription(String c_discription) {
		this.c_discription = c_discription;
	}
	
	

/**
	 * @return the product
	 */
	public List<Product> getProduct() {
		return product;
	}



	/**
	 * @param product the product to set
	 */
	public void setProduct(List<Product> product) {
		this.product = product;
	}



	//	Calling toString method for Category
	@Override
	public String toString() {
		return "Category [c_id=" + c_id + ", c_title=" + c_title + ", c_discription=" + c_discription + "]";
	}

}
