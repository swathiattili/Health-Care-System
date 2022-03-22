package com.training.cg.dp;

public abstract class VegRestaurant extends Menu {
	private String Veg;
	public VegMenu getMenus() {
		VegMenu vm=new VegMenu();
		VegRestaurant v=new VegRestaurant();
		return vm;
		
	}
	public String getVeg() {
		return Veg;
	}
	public VegRestaurant(String veg) {
		Veg = veg;
	}
	
}