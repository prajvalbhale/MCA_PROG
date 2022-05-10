package com.prajval.JAVA;

public class Exceptions {
	
	public static void main(String args[])
		{
			try {
				int a = 30, b = 0;
				int c = a/b; // cannot divide by zero
				System.out.println ("Result = " + c);
			}
			catch(ArithmeticException e) {
				System.out.println ("Can't divide a number by 0");
			}
			
			try {
				String a; 
				a = null; //null value
				System.out.println(a.charAt(0));
			} catch(NullPointerException e) {
				System.out.println("NullPointerException..");
			}
		}
	}