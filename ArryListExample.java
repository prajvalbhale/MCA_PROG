package com.prajval.JAVA;
	import java.io.*;
	import java.util.*;
	import java.util.Scanner;

public class ArryListExample {
	
	public static void main(String[] args)
		{
			int n = 9;			

			ArrayList<Integer> arrli = new ArrayList<Integer>(n);

			for (int i = 1; i <= n; i++)
			arrli.add(i);
 
			System.out.println(arrli);

			// Remove element at index 3
			arrli.remove(3);
			//display after delete
			System.out.println(arrli);

			// Printing elements 
			for (int i = 0; i < arrli.size(); i++)
				System.out.print(arrli.get(i) + " ");
		}
	}