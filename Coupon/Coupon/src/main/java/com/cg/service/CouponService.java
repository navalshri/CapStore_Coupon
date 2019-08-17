package com.cg.service;



import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.CouponDAO;
import com.cg.entity.Cart;
import com.cg.entity.Coupon;
import com.cg.entity.User1;


public class CouponService{
	Cart cart=new Cart();
	Date date=new Date();
	@Autowired CouponDAO dao;
	 @Transactional(readOnly=true)
	public Coupon getcoupon(User1 user)
	
	{
		 
		 Coupon c = dao.getcoupon(user);
		 if(c==null)
		 {
			 throw new RuntimeException( "Coupon not found"); 
		 }
		 else {
			 return c;
		 }
	}
	 
	 
		public double applycoupon(User1 user)
		{
			Coupon c = dao.getcoupon(user);
			double discount=c.getDiscount();
			double price=cart.getAmount();
			if(((c.getStartDate().compareTo(date))>0)&&((c.getEndDate().compareTo(date)))<0)
			{ 
				price=price-c.getDiscount();
				cart.setAmount(price);
			return price;
			}
			else
			{
				throw new RuntimeException( "Coupon not found");
		
				
			
		}
		
	}
	
	

}