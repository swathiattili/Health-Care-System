package com.training.cg.dp;

public class FactoryDesign {
	public static void main(String args[])
	{
		NotificationFactory factory=new NotificationFactory();
		Notification notification= factory.createNotification("sms");
	    notification.notifyUser();	
	}
}
//Factory Design Pattern:It is creational design pattern:
//It says that create an interface and let the subclass decide
// which object to create