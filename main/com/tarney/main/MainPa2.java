package com.tarney.main;

import com.tarney.stacks.DoubleStack;

public class MainPa2 {
	
	private static DoubleStack dblStack;

	public static void main(String[] args) {
		
		testStacks();
		
		
		
	}
	
	public static void testStacks() {
		
		dblStack = new DoubleStack();
		
		dblStack.pushA("a1");
		dblStack.pushB("b1");
		
		displayStacks("pushed 1 item to stackA and 1 item to stackB");
		
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.multiPopA(1);
		dblStack.multiPopB(1);
		
		displayStacks("pushed 2 more items to each stack and then popped 1 item from each stack");
		
		dblStack.multiPopA(2);
		dblStack.multiPopB(2);
		
		displayStacks("popped 2 items from each stack (each stack had 2 items previously)");
		
		dblStack.pushA("a1");
		dblStack.pushB("b1");
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.transfer(1);
		
		displayStacks("pushed 3 items to each stack and then transfered 1 item from stackA to stackB");
		
		dblStack.transfer(2);
		
		displayStacks("transfered 2 more items from stackA to stackB");
		
	}
	
	public static void displayStacks(String whatDidYouDo) {
		
		System.out.println(whatDidYouDo);
		System.out.println("StackA followed by StackB:");
		dblStack.getStackA().printStack();
		dblStack.getStackB().printStack();
		System.out.println("");

	}

}
