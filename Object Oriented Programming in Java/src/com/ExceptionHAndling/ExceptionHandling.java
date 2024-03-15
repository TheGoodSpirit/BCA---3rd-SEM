package com.ExceptionHAndling;

public class ExceptionHandling {
	
	// properties
	private String Name;
	private static int age = 17;
	
	public static void NullPointerException(String name ) {
    	System.out.println(name.length());
	}
	public static void main(String[] args) {
		
		// multiple catch block
		try {
			if(age < 18) {
				throw new ArithmeticException("cannot vote");
			}
			int[] arr = new int[10];
			System.out.println(arr[20]);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Parent Exception");
		}	
		NullPointerException(null);
	}
}