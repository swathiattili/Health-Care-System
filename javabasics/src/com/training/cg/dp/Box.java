package com.training.cg.dp;

public class Box {
	int length;
	int breadth;
	int height;
	
	public Box(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public int volume() {
		int vol;
		vol=length*breadth*height;
		return vol;
		
		
	}


}

