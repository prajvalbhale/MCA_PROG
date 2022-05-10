package com.prajval.DSA;
import static java.lang.System.exit;

public class StackUsingLinkedList {

		private class Node {

			int data; // integer data
			Node link; // reference variable Node type
		}
		Node top;
		StackUsingLinkedList()
		{
			this.top = null;
		}

		public void push(int x) // insert at the beginning
		{
			Node temp = new Node();

			temp.data = x;

			temp.link = top;

			top = temp;
		}

		public boolean isEmpty()
		{
			return top == null;
		}

		public int peek()
		{
			if (!isEmpty()) {
				return top.data;
			}
			else {
				System.out.println("Stack is empty");
				return -1;
			}
		}

		public void pop() // remove at the beginning
		{
			if (top == null) {
				System.out.print("\nStack Underflow");
				return;
			}

			top = (top).link;
		}

		public void display()
		{
			if (top == null) {
				System.out.printf("\nStack Underflow");
				exit(1);
			}
			else {
				Node temp = top;
				while (temp != null) {

					System.out.printf("%d->", temp.data);

					temp = temp.link;
				}
			}
		}

	
// main class
		public static void main(String[] args)
		{
			StackUsingLinkedList obj = new StackUsingLinkedList();
			obj.push(11);
			obj.push(22);
			obj.push(33);
			obj.push(44);

			obj.display();

			System.out.printf("\nTop element is %d\n", obj.peek());

			obj.pop();
			obj.pop();

			obj.display();

			System.out.printf("\nTop element is %d\n", obj.peek());
		}
	}