package com.customer_management_system;

public enum ServicePlans {
    SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double charges;

	private ServicePlans(int charges) {
		this.charges=charges;
	}
   
	public String toString()
	{
		return name()+" : "+charges;
	}
	
	public double getCharges() {
		return charges;
	}
	
	

}
