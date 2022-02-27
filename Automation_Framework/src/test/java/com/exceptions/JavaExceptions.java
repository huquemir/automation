package com.exceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class JavaExceptions {

	String firstname;
	
	public static void main(String[] args) throws Exception {
		JavaExceptions obj = new JavaExceptions();
		//obj.arithmeticException();
		//obj.indexOutOfBoundException();
		//obj.inputOutputException();
		//obj.inputOutputException1();
		//obj.nullPointException();
		obj.throwExample();
		
	}
	
	// Compile time Exception with throws example
	public void inputOutputException() throws IOException   {
	BufferedReader read = new BufferedReader(new FileReader ("C:\\Users\\mirhuque\\git\\mainrepo\\Automation_Framework\\testfile"));
		System.out.println(read.readLine());
		
	}
	
	public void callingIOException() throws IOException {
		JavaExceptions obj = new JavaExceptions();
		obj.inputOutputException();
		obj.inputOutputException1();
		
	}
	
	// Compile time Exception with try/catch example
	
	public void inputOutputException1()  {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader ("C:\\Users\\mirhuque\\git\\mainrepo\\Automation_Framework\\testfile"));
			System.out.println(read.readLine());
		} catch (FileNotFoundException e) {
			System.out.println("This is at the catch level");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("This is at the second catch level");
			e.printStackTrace();
		} finally {
			System.out.println("The finally block will always execute the code");
		}

	} 
	
			
		
	
	
	
	
	
	
	// Runtime Exception - Can also be handled with try/catch but NOT with throws
	public void arithmeticException() {
		int a = 12;
		int b = 4;
		int c = 0;
		
		try {
		System.out.println(b/c);
		
		} catch (ArithmeticException e) {
			
		System.out.println(a/b);
		System.out.println(a/c);
		} catch (Exception e) {
		System.out.println(b/c);
		} finally {
			System.out.println(a/b);
		}
		
	}
	
	//Runtime Exception 
	public void indexOutOfBoundException() {
		
		int [] num = new int[3];
		num[0] = 10;
		num[1] = 15;
		num[2] = 20;
		num[3] = 30;
		
		System.out.println(Arrays.toString(num));
		
	}
	// Runtime exception, so must use try/catch
	public void nullPointException() {
		String lastname = "test";
		System.out.println(lastname.concat(firstname));
	}
	
	//We are creating an exception to send a system message
	public void throwExample() throws Exception {
		
		System.out.println("This is the throw example method");
		throw new Exception("This is a custom message from the developer");		
		
	}
	

}
