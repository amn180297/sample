package com.cg.spring.plpmod20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.plpmod20.beans.Coupons;
import com.cg.spring.plpmod20.repo.CouponRepo;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	CouponRepo repo;

	@Override
	public void addCoupon(Coupons p) {
		java.sql.Timestamp expiry_time = new java.sql.Timestamp(new java.util.Date().getTime());
		p.setTimestamp(expiry_time);
		repo.save(p);
		repo.deleteOldCoupons();

	}

}
