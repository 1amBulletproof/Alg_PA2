package com.tarney.main;

import java.util.LinkedList;

import com.tarney.sorts.BucketSort;
import com.tarney.sorts.CustomDouble;
import com.tarney.sorts.DoubleValued;
import com.tarney.stacks.DoubleStack;

public class MainPa2 {
	
	//Runs the main program
	public static void main(String[] args) {
		
		System.out.println("***Problem 1 Chapter 8 (b) Bucket-Sort***\n");
		double[] bucketSortValues = {0.79, 0.13, 0.16, 0.64, 0.39, 0.20, 0.89, 0.53, 0.71, 0.42};
		testBucketSort(bucketSortValues);
		
		System.out.println("\n\n***Problem 2 Chapter 17 Stacks***\n");
		testStacks();
		
	}
	
	/*
	 * tests Bucket Sort
	 * 
	 * @param	bucketSortValues	arary of doubles which will be sorted
	 * @return
	 */
	private static void testBucketSort( double[] bucketSortValues) {
		
		LinkedList<DoubleValued> listToSort = new LinkedList<>();
		for (int index = 0; index < bucketSortValues.length; index++) {
			listToSort.add(new CustomDouble(bucketSortValues[index]));
		}
		
		displayList("List before Bucket Sort", listToSort);
		
		displayList("list after bucket sort", BucketSort.sort(listToSort));
		
	}

	/*
	 * Prints the contents of a list with a message
	 * 
	 * @param	message		message to be printed
	 * @param	list		list of DoubleValued items
	 * @return
	 */
	private static void displayList(String message, LinkedList<DoubleValued> list) {
		
		System.out.println(message);
		for (DoubleValued element: list) {
			System.out.println(element.getKey());
		}
		System.out.println("");
		
	}

	/*
	 * Tests the functionality of 2 stacks
	 * 
	 * @param
	 * @return
	 */
	public static void testStacks() {
		
		DoubleStack dblStack = new DoubleStack();
		
		dblStack = new DoubleStack();
		
		dblStack.pushA("a1");
		dblStack.pushB("b1");
		
		displayStacks("pushed 1 item to stackA and 1 item to stackB", dblStack);
		
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.multiPopA(1);
		dblStack.multiPopB(1);
		
		displayStacks("pushed 2 more items to each stack and then popped 1 item from each stack", dblStack);
		
		dblStack.multiPopA(2);
		dblStack.multiPopB(2);
		
		displayStacks("popped 2 items from each stack (each stack had 2 items previously)", dblStack);
		
		dblStack.pushA("a1");
		dblStack.pushB("b1");
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.transfer(1);
		
		displayStacks("pushed 3 items to each stack and then transfered 1 item from stackA to stackB", dblStack);
		
		dblStack.transfer(2);
		
		displayStacks("transfered 2 more items from stackA to stackB", dblStack);
		
	}
	
	/*
	 * Prints the contents of double stack
	 * 
	 * @param	whatDidYouDo	message describing most recent step
	 * @param	dblStack		DoubleStack data structure containing 2 stack
	 * @return
	 */
	public static void displayStacks(String whatDidYouDo, DoubleStack dblStack) {
		
		System.out.println(whatDidYouDo);
		System.out.println("StackA followed by StackB:");
		dblStack.getStackA().printStack();
		dblStack.getStackB().printStack();
		System.out.println("");

	}

}
