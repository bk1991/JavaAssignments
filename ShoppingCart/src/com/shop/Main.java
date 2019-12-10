package com.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<DiscountSlab> discountSlabs = new ArrayList<>();
		
		discountSlabs.add(new DiscountSlab(5001, 5));
		discountSlabs.add(new DiscountSlab(10001, 10));
		
		DiscountCalculator discountCalculator = new DiscountCalculator(discountSlabs);
		System.out.println(discountCalculator.getDiscountedAmount(5000));
		System.out.println(discountCalculator.getDiscountedAmount(10000));
		System.out.println(discountCalculator.getDiscountedAmount(15000));
	}

}
