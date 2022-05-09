package com.prajval.JAVA;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Builders {
		public static void main(String[] argv)
			throws Exception
		{
			StringBuilder str = new StringBuilder();

			str.append("prajval bhale");

			System.out.println("String = " + str.toString());

			StringBuilder str1 = new StringBuilder("PRAJVAL_RAJU_BHALE");

			System.out.println("String1 = " + str1.toString());

			StringBuilder str2 = new StringBuilder(10);

			// print string
			System.out.println("String2 capacity = " + str2.capacity());

			StringBuilder str3 = new StringBuilder(str1.toString());
 
			System.out.println("String3 = " + str3.toString());
		}
	}