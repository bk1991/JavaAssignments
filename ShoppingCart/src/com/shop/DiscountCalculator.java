package com.shop;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DiscountCalculator {
	private List<DiscountSlab> discountSlabs;
	
	public DiscountCalculator(List<DiscountSlab> discountSlabs) {
		super();
		this.discountSlabs = discountSlabs;
	}
	
	public double getDiscountedAmount(double purchaseAmount) {
		double totalDiscount = 0;
		DiscountSlab appropriateDiscountSlab = getAppropriateDiscountSlab(purchaseAmount);
		if( appropriateDiscountSlab != null )
			totalDiscount = (appropriateDiscountSlab.getDiscountPercentage() / 100) * purchaseAmount; 
		return purchaseAmount - totalDiscount;
	}
	
	
	private DiscountSlab getAppropriateDiscountSlab(double purchaseAmount) {
		Collections.sort(discountSlabs);
		Iterator<DiscountSlab> discountSlabsIteator = discountSlabs.iterator();
		DiscountSlab discountSlab = null;
		while(discountSlabsIteator.hasNext()) {
			DiscountSlab nextDiscountSlab = discountSlabsIteator.next();
			if( nextDiscountSlab.getMinPurchaseRequired() > purchaseAmount )
				break;
			discountSlab = nextDiscountSlab;
		}
		return discountSlab;
	}

	public List<DiscountSlab> getDiscountSlabs() {
		return discountSlabs;
	}
	public void setDiscountSlabs(List<DiscountSlab> discountSlabs) {
		this.discountSlabs = discountSlabs;
	}
}
