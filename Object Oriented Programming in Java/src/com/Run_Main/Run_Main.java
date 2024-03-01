package com.Run_Main;

// importing other packages
import com.greet.*;
import com.simple_Interest.*;
import com.method_overloading.*;
import com.method_overriding.*;

public class Run_Main {
	public static void main(String[] args) {

		// Greet Program
		Greet _msg = new Greet("Hello World!");
		
		// Calculating Simple Interest
		SimpleInterest _SI = new SimpleInterest(10000, 20, 15.4f);
		
		// Method Overloading
		Method_Overloading _overloading1 = new Method_Overloading("Overloading.......");
		Method_Overloading _overloading2 = new Method_Overloading(405);
		
		// Method Overriding
		Bike honda = new Bike();
		honda.engine();
		
		Car benz = new Car();
		benz.engine();
	}
}