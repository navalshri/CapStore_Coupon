package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entity.Coupon;
import com.cg.entity.User1;
@Repository

public interface CouponDAO extends JpaRepository<Coupon, Integer> {
	@Query("select Coupon c where c.user=?1")
	public Coupon getcoupon(User1 user);
	@Query("select c.discount from Coupon c where c.user=?1")
	public double getdiscount(User1 user) ;
}
