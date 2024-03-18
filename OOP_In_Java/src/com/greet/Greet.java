package com.greet;

public class Greet {
	
	// properties
	String _Message;
	
	// constructor 
	public Greet(String Mssg) {
		if(Mssg.equals("")) {
			System.out.println("Invalid Message.TRY AGAIN!");
		} else {
			this._Message = Mssg;
			_display();
		}
	}
	
	void _display() {
		System.out.println(_Message);
	}
}