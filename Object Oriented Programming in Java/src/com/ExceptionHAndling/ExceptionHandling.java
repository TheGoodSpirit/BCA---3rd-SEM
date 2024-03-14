package com.ExceptionHAndling;

public class ExceptionHandling {
	
	// properties
	@SuppressWarnings("unused")
	private String Name;
	
	public static void NullPointerException(String name ) {
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		
		// multiple catch block
		try {
			@SuppressWarnings("unused")
			int res = 50/0;
			int[] arr = new int[10];
			System.out.println(arr[20]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Parent Exception");
		}
		
		// NullPointerException
		NullPointerException(null);
	}
}