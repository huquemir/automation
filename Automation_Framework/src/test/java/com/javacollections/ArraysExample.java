package com.javacollections;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
	
	public static void main(String[] args) {
	//primitive data type 
	//intialization  Declaration
		int num = 10;
		System.out.println(num);	
		
		//non-primitive data type
		String name = "Mir";
		System.out.println(name);
	
		 
		
		//index starts with 0
		//Single Dimension Array
		//There are a couple of ways to use array. Old way:
		int number [] = new int [5];
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		
		//If we want to print a specific value
		System.out.println(number[2]);
		
		//If we want to print the whole Array
		System.out.println(Arrays.toString(number));
		
		//New way of storing Array:
						//0   1   2   3    4   5   6  7
		int numbers [] = {10, 20, 30, 40, 50, 60, 70, 75};
		System.out.println(Arrays.toString(numbers));
		
		//We can use Loops to print the data as well
		//Here we can use the for loop
		
		//for (initial value; condition; increment)
		// i++ means i + 1
		// iterate
		// This is an example of basic loop
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Advance for loop
		for (int i : numbers) {
			System.out.println(i);
		}
		
		
		
		String names [] = {"Jalal", "Chhabed", "Franklin"};
		System.out.println(Arrays.toString(names));
		
		//Multi-Dimension Array
		int numbers1 [] [] = {{10, 20, 30, 40, 50}, // [0] is the row and [4] is the column
				              {60, 70, 80, 90, 100}};
		System.out.println(numbers1[0][4]);
		System.out.println(numbers1[0][2]);
		System.out.println(numbers1[1][3]);
		
	
	}
	
	
	
		

}
