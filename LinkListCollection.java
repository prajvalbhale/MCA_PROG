package com.prajval.JAVA;
import java.util.*;

public class LinkListCollection {
		
		public static void main(String[] args)
		{
			LinkedList<Integer> ll = new LinkedList<Integer>();
			for (int i = 1; i <= 7; i++)
				ll.add(i);
			System.out.println(ll);
			ll.remove(4); /*<-- REMOVE ELEMENT*/
			
			System.out.println(ll);

			for (int i = 0; i < ll.size(); i++)
				System.out.print(ll.get(i) + " ");
		}
	}
