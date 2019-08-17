package com.cg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Coupon;
import com.cg.entity.User1;
import com.cg.service.CouponService;
@RestController
@RequestMapping(value="/coupon")
public class CouponController {
	@Autowired CouponService service;
	 @GetMapping(value="/check/{userid}")	
	    public Coupon getbyid(@PathVariable User1 user) 
	 {
	        return service.getcoupon(user);
	    
	 }

	    
	    @GetMapping(value="/apply/{userid}")	
	    public double findbycode(@PathVariable User1 user) {
	        return service.applycoupon(user);
	    }
	
	

}
