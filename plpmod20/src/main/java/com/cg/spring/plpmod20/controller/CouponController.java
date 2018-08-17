package com.cg.spring.plpmod20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.plpmod20.beans.Coupons;
import com.cg.spring.plpmod20.service.CouponService;

@RestController
public class CouponController {

	@Autowired
	CouponService service;

	@RequestMapping(method = RequestMethod.POST, value = "/addcoupon")
	public String add(Coupons p) {
		service.addCoupon(p);
		return "Coupon Added Successfully";
	}
}
