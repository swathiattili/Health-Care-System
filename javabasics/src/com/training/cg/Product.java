package com.training.cg;

public class Product {
	private String prodId;
	private String proName;
	private String proDesc;
	private double price;
	//Default constructor
	   Product(){
	     System.out.println("Constructor call");
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		 
			
		
		
	}

	}

