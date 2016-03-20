package com.tarney.stacks;

import java.util.LinkedList;

public class StackLinkedList implements Stack {

	private LinkedList<Object> linkedList;
	
	public void stackLinkedList() {
		
		linkedList = new LinkedList<>();
		
	}
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public Object multiPop(int howManyPops) {
		// TODO multipop method
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
