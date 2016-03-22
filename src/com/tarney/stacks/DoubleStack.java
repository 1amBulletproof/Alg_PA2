package com.tarney.stacks;

public class DoubleStack {
	
	private StackLinkedList stackA;
	private StackLinkedList stackB;
	
	public DoubleStack() {
		
		stackA = new StackLinkedList();
		stackB = new StackLinkedList();
		
	}
	
	/*
	 * Place an element on the top of stack A
	 * 
	 * @param	input	string element placed on top of stack
	 * @return
	 */
	public void pushA(String input) {
		stackA.push(input);	
	}

	/*
	 * Place an element on the top of stack B
	 * 
	 * @param	input	string element placed on top of stack
	 * @return
	 */
	public void pushB(String input) {
		stackB.push(input);
	}
	
	/*
	 * Pop a certain number of elements from Stack A
	 * 
	 * @param	numberOfPops	number of items to pop from the stack
	 * @return	String			last element popped off the stack
	 */
	public String multiPopA(int numberOfPops) {	
		return stackA.multiPop(numberOfPops);
	}

	/*
	 * Pop a certain number of elements from Stack B
	 * 
	 * @param	numberOfPops	number of items to pop from the stack
	 * @return	String			last element popped off the stack
	 */
	public String multiPopB(int numberOfPops) {	
		return stackB.multiPop(numberOfPops);
	}
	
	/*
	 * Transfer a certain number of elements from Stack A to Stack B
	 * 
	 * @param	numberOfTransfers	number of elements to move from Stack A to Stack B
	 * @return
	 */
	public void transfer(int numberOfTransfers) {
		
		for (int counter = 0; counter < numberOfTransfers; counter++) {
			stackB.push(stackA.pop());
		}
		
	}

	public StackLinkedList getStackA() {
		return stackA;
	}

	public StackLinkedList getStackB() {
		return stackB;
	}

}
