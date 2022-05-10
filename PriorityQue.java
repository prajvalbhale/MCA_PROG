package com.prajval.DSA;
import java.util.*;

public class PriorityQue {		
		public static void main(String args[])
		{
			PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

			pQueue.add(10);
			pQueue.add(20);
			pQueue.add(15);
			
			System.out.println("PRIORITY QUEUE IS :--> " +pQueue);

			System.out.println("TOP ELEMENT OF PRIORITYQUEUE :--> "+pQueue.peek());

			System.out.println("PRINT TOP ELEMENT & REMOVING IT :--> "+pQueue.poll());

			System.out.println("PRINT TOP ELEMENT AGAIN :--> "+pQueue.peek());
		}
	}