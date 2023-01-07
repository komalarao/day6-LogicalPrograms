package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		System.out.println("welcome to java logical programs");
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);	
        StringBuffer sb=new StringBuffer();
        
        while (random>0)
        {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }
    
        String coupon_Code=sb.toString();
        System.out.println("Coupon Code: "+coupon_Code);	
	        
	}

}
