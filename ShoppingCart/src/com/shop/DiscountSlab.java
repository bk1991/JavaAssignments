package com.shop;

public class DiscountSlab implements Comparable<DiscountSlab>{
	private long minPurchaseRequired;
	private double discountPercentage;
	
	public DiscountSlab(long minPurchaseRequired, double discount) {
		super();
		this.minPurchaseRequired = minPurchaseRequired;
		this.discountPercentage = discount;
	}
	
	public long getMinPurchaseRequired() {
		return minPurchaseRequired;
	}
	public void setMinPurchaseRequired(long minPurchaseRequired) {
		this.minPurchaseRequired = minPurchaseRequired;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	@Override
	public int compareTo(DiscountSlab other) {
		if( this.getMinPurchaseRequired() < other.getMinPurchaseRequired())
			return -1;
		else if( this.getMinPurchaseRequired() > other.getMinPurchaseRequired())
			return 1;
		else
			return 0;
	}
}
