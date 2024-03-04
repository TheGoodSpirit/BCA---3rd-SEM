package com.Area;

public class Area {
	// properties
	private float length, breadth;
	
	// constructor
	public Area(float l, float b) {
		if(l <= 0 || b <=0 ) {
			System.out.println("Invalid Input!");
		} else {
			this.length = l;
			this.breadth = b;
		}
	}
	
	public void check() {
		if(length == breadth) {
			System.out.println("This is a SQUARE.");
		} else {
			System.out.println("This is a RECTANGLE.");
		}
	}
	
	public float calculate() {
		return (length * breadth);
	}
	
	public void display() {
		System.out.println("Area :" + calculate());
	}
	
}
