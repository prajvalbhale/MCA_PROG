package com.prajval.JAVA;

public class UserException extends Exceptions {

	// A Class that uses above MyException
	public class setText {
		// Driver Program
		public static void main(String args[])
		{
			try {
				// Throw an object of user defined exception
				throw new UserException();
			}
			catch (UserException ex) {
				System.out.println("Caught");
				System.out.println(ex.getMessage());
			}
		}
	}
	class Exceptions {
		
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
}