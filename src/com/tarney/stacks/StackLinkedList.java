/**
 * Stack based on Stack.java interface & using a Doubly-linked List
 * 
 * stores string elements
 * 
 * @author Tarney
 * @version 1.0 3/21/16
 */

package com.tarney.stacks;

import java.util.LinkedList;

public class StackLinkedList implements Stack {

	private LinkedList<String> linkedList;
	
	public StackLinkedList() {	
		linkedList = new LinkedList<>();	
	}
	
	public StackLinkedList(LinkedList<String> list) {	
		linkedList = list;
	}
	
	@Override
	public void push(String x) {
		linkedList.add(x);
	}

	@Override
	public String pop() throws StackUnderflowException {
		
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		return linkedList.removeLast();
		
	}
	
	@Override
	public String peek() {
		return (isEmpty() ? "FAILED PEEK: STACK EMPTY" : linkedList.getLast());
	}
	
	@Override
    public String multiPop(int howManyPops) {
		
		//Pop 1 fewer than the total number of pops so you can return the last pop
		for (int counter = 1; counter < howManyPops; counter++) {
			pop();
		}
		
		return pop();
	}

	@Override
	public boolean isEmpty() {	
		return ((getSize() == 0) ? true : false);
	}
	
	@Override
	public int getSize() {
		return linkedList.size();
	}
	
	public void printStack() {
		for (String element : linkedList) {
			System.out.println(element);
		}
	}

}
