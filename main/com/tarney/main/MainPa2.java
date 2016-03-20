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
		
		displayStacks();
		
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.multiPopA(1);
		dblStack.multiPopB(1);
		
		displayStacks();
		
		dblStack.multiPopA(2);
		dblStack.multiPopB(2);
		
		displayStacks();
		
		dblStack.pushA("a1");
		dblStack.pushB("b1");
		dblStack.pushA("a2");
		dblStack.pushB("b2");
		dblStack.pushA("a3");
		dblStack.pushB("b3");
		
		dblStack.transfer(1);
		
		displayStacks();
		
		dblStack.transfer(2);
		
		displayStacks();
		
	}
	
	public static void displayStacks() {
		
		System.out.println("StackA followed by StackB:");
		dblStack.getStackA().printStack();
		dblStack.getStackB().printStack();
		System.out.println("");

	}

}
