package com.training.cg;

public class ProductTest {

	public static void main (String args[]) {
	
	  Product pro1 = new Product();
	  Product pro2 = new Product();
	  Product pro3 = new Product();
	  Product pro4 = new Product();
	  Product pro5 = new Product();
	  int[] price= new int[][pro1.getPrice() , pro2.getPrice(),pro3.getPrice(),pro4.getPrice(),pro5.getPrice() ]
			  getPrice=0;
	  int i;
	  for(i=0;i<=5;i++)
	  if(pro1.getPrice()>25000) {
      pro1.setProdId("12345_id");
	  pro1.setProName("xyz");
	  pro1.setProDesc("high quality");
	  pro1.setPrice(20000);
	  System.out.println("pro1 getProdId()");
	  System.out.println("pro1 getProName()");
	  System.out.println("pro1 getProDes()");
	  System.out.println("pro1 getPrice()");
	}
	 else if (pro2.getPrice()>25000) {
	 pro2.setProdId("123_id");
	  pro2.setProName("tab");
	  pro2.setProDesc("high quality");
	  pro2.setPrice(2000);
	  System.out.println("pro2 getProdId()");
	  System.out.println("pro2 getProName()");
	  System.out.println("pro2 getProDes()");
	  System.out.println("pro2 getPrice()");
	 }  
	 
	 else if(pro3.getPrice()>25000) {
      pro3.setProdId("456_Id");
	  pro3.setProName("tv");
	  pro3.setProDesc("high quality");
	  pro3.setPrice(8000);
	  System.out.println("pro3 getProdId()");
	  System.out.println("pro3 getProName()");
	  System.out.println("pro3 getProDes()");
	  System.out.println("pro3 getPrice()");
	 }
	  
	 else if(pro4.getPrice()>25000) { 
	  pro4.setProdId("789_id");
	  pro4.setProName("mobile");
	  pro4.setProDesc("high quality");
	  pro4.setPrice(10000);
	  System.out.println("pro4 getProdId()");
	  System.out.println("pro4 getProName()");
	  System.out.println("pro4 getProDes()");
	  System.out.println("pro4 getPrice()");
	 }
	  
    
	 else if(pro5.getPrice()>25000) { 
	  pro5.setProdId("1234_id");
	  pro5.setProName("laptop");
	  pro5.setProDesc("high quality");
	  pro5.setPrice(22000);
	  System.out.println("pro5 getProdId()");
	  System.out.println("pro5 getProName()");
	  System.out.println("pro5 getProDes()");
	  System.out.println("pro5 getPrice()");
        
	 }
	  

	  
	}
}
	




