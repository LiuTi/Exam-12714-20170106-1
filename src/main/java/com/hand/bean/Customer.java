package com.hand.bean;
/**
 * Customer实体类
 * @author violet
 *
 */
public class Customer {
	private Integer customer_id;
	private String first_name;
	public Customer(){}
	public Customer(String first_name) {
		super();
		this.first_name = first_name;
	}
	public Customer(Integer customer_id, String first_name) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public Customer setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
		return this;
	}
	public String getFirst_name() {
		return first_name;
	}
	public Customer setFirst_name(String first_name) {
		this.first_name = first_name;
		return this;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name="
				+ first_name + "]";
	}
	
}
