package com.Voting_Sys;

public class VotingSystem {
	// properties
	private int age;
	
	// constructor
	public VotingSystem(int age) {
		if(age <= 0) {
			System.out.println("Invalid Input");
		} else {
			this.age = age;
		}
	}
	
	public void check() {
		if(age >= 18) {
			System.out.println("You can vote.");
		} else {
			System.out.println("You cannot vote.");
		}
	}
}
