package com.Run_Main;
import java.util.Scanner;

// importing other packages
import com.greet.*;
import com.simple_Interest.*;
import com.method_overloading.*;
import com.method_overriding.*;
import com.simple_Interest.*;
import com.Area.*;

public class Run_Main {
	public static void main(String[] args) {
		
		// Scanner initialization
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========== OPTION ==========");
		System.out.println("1. Simple Interest");
		System.out.println("2. Area\n");
		
		
		// option
		System.out.print("\nEnter the option : ");
		int op = scan.nextInt();
		
		switch(op) {
			case 1:
				// ==================== Simple Interest ====================
				System.out.println("\n========== Simple Interest ==========");
				// for principal
				System.out.print("Enter the principal: ");
				int p = scan.nextInt();
				// for time
				System.out.print("Enter the time: ");
				int t = scan.nextInt();
				// for rate
				System.out.print("Enter the rate: ");
				float r = scan.nextFloat();
				SimpleInterest _SI = new SimpleInterest(p, t, r);
				break;
			
			case 2:
				// ==================== Area ====================
				System.out.println("\n========== Area ==========");
				System.out.print("Enter the length: ");
				float l = scan.nextFloat();
				System.out.print("Enter the breadth: ");
				float b = scan.nextFloat();
				
				// Creating object for class Area
				Area area = new Area(l,b);
				area.check();
				area.calculate();
				area.display();
				break;
		}
	}
}