package com.prajval.DSA;
import java.util.*;

public class RevStr {
		public static String ReverseString(String str)
		{
			char[] reverseString = new char[str.length()];
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < str.length(); i++) 
			{
				stack.push(str.charAt(i));
			}

			int i = 0;
			while (!stack.isEmpty()) 
			{ 	
				reverseString[i++] = stack.pop();
			}
			return new String(reverseString);
		}

		public static void main(String[] args)
		{
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("ENTER THE STRING :--> ");
				String str1 = sc.nextLine();
							
				System.out.println("REVERSE STRING -> " + ReverseString(str1));
			}
		}
	}