package com.tarney.stacks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class DoubleStackTest {

	DoubleStack doubleStack;

	@Before
	public void setUp() {
		doubleStack = new DoubleStack();
	}

	@Test
	public void testPushA() {
		
		doubleStack.pushA("a1");
		assertThat(doubleStack.getStackA().peek(), is("a1"));
		
		doubleStack.pushA("a2");
		assertThat(doubleStack.getStackA().peek(), is("a2"));
		
	}
	
	@Test
	public void testPushB() {
		
		doubleStack.pushB("b1");
		assertThat(doubleStack.getStackB().peek(), is("b1"));
		
		doubleStack.pushB("b2");
		assertThat(doubleStack.getStackB().peek(), is("b2"));
	}
	
	@Test
	public void testMultiPopA() {
		
		doubleStack.pushA("a1");
		assertThat(doubleStack.multiPopA(1), is("a1"));
		assertThat(doubleStack.getStackA().getSize(), is(0));
		
		doubleStack.pushA("a1");
		doubleStack.pushA("a2");
		doubleStack.pushA("a3");
		assertThat(doubleStack.multiPopA(2), is("a2"));
		assertThat(doubleStack.getStackA().getSize(), is(1));
		
	}
	
	@Test
	public void testMultiPopB() {
		
		doubleStack.pushB("b1");
		assertThat(doubleStack.multiPopB(1), is("b1"));
		assertThat(doubleStack.getStackB().getSize(), is(0));
		
		doubleStack.pushB("b1");
		doubleStack.pushB("b2");
		doubleStack.pushB("b3");
		assertThat(doubleStack.multiPopB(2), is("b2"));
		assertThat(doubleStack.getStackB().getSize(), is(1));
		
	}
	
	@Test
	public void testTransfer() {
		
		doubleStack.pushA("a1");
		doubleStack.pushB("b1");
		doubleStack.transfer(1);
		
		assertThat(doubleStack.getStackA().getSize(), is(0));
		assertThat(doubleStack.getStackB().getSize(), is(2));
		
		assertThat(doubleStack.getStackB().peek(), is("a1"));
	}

}
