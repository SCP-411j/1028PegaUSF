package com.example.scanner;

import java.util.Scanner;

public class MyClass {
/*
 * The scanner class is used to get user input through the console
 * 
 * it is found in the java.util.package
 */

	public static void main(String[] args) {
		
		//create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter your name: ");
		
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("What is your phone number? ");
		long phoneNumber = sc.nextLong();
		
		System.out.println(name + ", how old are you?");
		int age = sc.nextInt();
		
		
		if(age > 20) {
			System.out.println("You are legal, please enter the liquor store");
		}else {
			System.out.println("Plese come back when you are 21");
		}
		
		
		
		
		
		
		
	}
}
