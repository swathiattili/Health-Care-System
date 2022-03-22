package com.training.cg.dp;

public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		
		decoratedShape.draw();
		setBlueBorder(decoratedShape);
	}
	private void setBlueBorder(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Shape border color: Blue");
	}
	

}
