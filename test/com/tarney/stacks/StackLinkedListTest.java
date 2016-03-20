package com.tarney.stacks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Matchers.notNull;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;

public class StackLinkedListTest {
	
	private StackLinkedList stack;
	
	@Before
	public void setup() {
		
		stack = new StackLinkedList();
		
	}

	@Test
	public void testSize() {

		assertThat(stack.isEmpty(), is(true));
		
		LinkedList<String> testList = new LinkedList<>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		stack = new StackLinkedList(testList);
		
		assertThat(stack.getSize(), is(3));
		
	}

	@Test
	public void testPushAndPeek() {
		
		assertThat(stack.isEmpty(), is(true));
		assertThat(stack.peek(), is("FAILED PEEK: STACK EMPTY"));
		
		stack.push("1");
		
		assertThat(stack.getSize(), is(1));
		assertThat(stack.peek(), is("1"));
		
		stack.push("2");
		
		assertThat(stack.getSize(), is(2));
		assertThat(stack.peek(), is("2"));

	}

	@Test
	public void testPop() {
		
		assertThat(stack.isEmpty(), is(true));
		
		stack.push("1");
		
		assertThat(stack.getSize(), is(1));
		assertThat(stack.pop(), is("1"));
		assertThat(stack.isEmpty(), is(true));
		
		stack.push("1");
		stack.push("2");
		
		assertThat(stack.getSize(), is(2));
		assertThat(stack.pop(), is("2"));
		assertThat(stack.getSize(), is(1));

	}

	@Test
	public void testMultiPop() {
		
		assertThat(stack.isEmpty(), is(true));
		
		stack.push("1");
		
		assertThat(stack.multiPop(1), is("1"));
		assertThat(stack.getSize(), is(0));
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		assertThat(stack.multiPop(2), is("2"));
		assertThat(stack.getSize(), is(1));

	}

	@Test
	public void testIsEmpty() {
		
		assertThat(stack.getSize(), is(0));
		assertThat(stack.isEmpty(), is(true));

	}

}
