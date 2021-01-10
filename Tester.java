package com.app.stack;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

	/* Q2.1 Define Stack as Abstract Data Type (ADT). */
	/*
	 * Q2.3 Implement a class for Stack ADT (defined in Q2.1), that implements stack
	 * using array. The class should accept the size of array during object creation
	 * (via Constructor).
	 */
	
	/*Q2.4 Write a small program that accept some input and displays the same in reverse other. 
	 *Use stack class implemented in Q2.3, to reverse the data.
	*/
	
	public static void main(String[] args) {
		int[] stackArray = null;
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the size of your Stack: ");

			StackOpertaionInterface stInterface = new Stack(sc.nextInt());

			boolean exit = false;

			while (!exit) {

				System.out.println("Do you want to : ");
				System.out.println("1.  Push");
				System.out.println("2.  Pop");
				System.out.println("3.  Check if Empty");
				System.out.println("4.  Check if Full");
				System.out.println("5.  Print Stack");
				System.out.println("6.  Print Stack in reverse order");
				System.out.println("7.  Exit");

				System.out.println("Please enter your choice");

				switch (sc.nextInt()) {

				case 1:

					System.out.println("Enter the integer to push");
					stInterface.push(sc.nextInt());

					break;

				case 2:

					System.out.println("Popped element is: " + stInterface.pop());

					break;

				case 3:

					System.out.println("Is the stack Empty?    Ans: " + stInterface.isEmpty());

					break;

				case 4:

					System.out.println("Is the stack Full?    Ans: " + stInterface.isFull());

					break;

				case 5:

					stackArray = ((Stack) stInterface).getArr();
					
					System.out.println(Arrays.toString(stackArray));
					
					break;

				case 6:
					
					if(stInterface.isEmpty()) {
						System.out.println("Empty...");
					}else {
						for(int i = stackArray.length-1 ; i >= 0; i--) {
							System.out.println(stackArray[i]);
						}
					}
					
					break;
					
				case 7:
					
					System.out.println("Bye!");
					exit = true;
					System.exit(0);
					
					break;
					
				default:
					
					System.out.println("Enter valid choice!!!");
					
					break;
				}

			}

		}
	}

}
