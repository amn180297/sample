package com.cg.spring.plpmod20.beans;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupons {

	@Id
	private String coupon_id;
	private Integer discount;
	private Integer validity;
	private Integer no_of_transaction;
	private Timestamp timestamp;

	public Coupons() {
		// TODO Auto-generated constructor stub
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Coupons(String coupon_id, Integer discount, Integer validity, Integer no_of_transaction,
			Timestamp timestamp) {
		super();
		this.coupon_id = coupon_id;
		this.discount = discount;
		this.validity = validity;
		this.no_of_transaction = no_of_transaction;
		this.timestamp = timestamp;
	}

	public String getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public Integer getNo_of_transaction() {
		return no_of_transaction;
	}

	public void setNo_of_transaction(Integer no_of_transaction) {
		this.no_of_transaction = no_of_transaction;
	}

}
