package com.training.cg.dp;

public class DecoratorTest {
public static void main(String args[]) {
	Shape square=new Square();
	Shape blueSquare = new BlueShapeDecorator( new Square());
	Shape  blueRectangl = new BlueShapeDecorator(new Rectangl());
System.out.println("Drawing normal square::");
square.draw();
System.out.println("Drawing suqare with blue border::");
blueSquare.draw();
System.out.println("Drawing rectangle with blue border::");
blueRectangl.draw();
}
}
