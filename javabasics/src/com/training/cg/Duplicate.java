package com.training.cg;

import java.util.Set;

public class Duplicate {
 
	 private int price;
	 private String item;
	 public Duplicate(String itm,int pr) {
		this.item=itm;
		this.price=pr;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}

		public String toString() {
			return "item:"+item+"price:"+price;
		}

 }

