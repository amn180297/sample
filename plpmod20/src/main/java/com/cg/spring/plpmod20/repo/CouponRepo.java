package com.cg.spring.plpmod20.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.plpmod20.beans.Coupons;

@Repository
public interface CouponRepo extends CrudRepository<Coupons, String> {
	@Query(value = "DELETE FROM Coupons WHERE  timestamp < (NOW() - INTERVAL 1 MINUTE)", nativeQuery = true)
	public void deleteOldCoupons();

}
