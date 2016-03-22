package com.tarney.sorts;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Matchers.notNull;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;

public class InsertionSortTest {

	@Test
	public void testSort() {
		
		LinkedList<DoubleValued> testList = new LinkedList<>();
		testList.add(new CustomDouble(0.2));
		testList.add(new CustomDouble(0.3));
		testList.add(new CustomDouble(0.1)); 
		testList.add(new CustomDouble(0.7));
		testList.add(new CustomDouble(0.05));
		
		assertThat(testList.get(2).getKey(), is(0.1));
		
		LinkedList<DoubleValued> testSortedList = InsertionSort.sort(testList);
		
		assertThat(testSortedList.get(0).getKey(), is(0.05));
		assertThat(testSortedList.get(4).getKey(), is(0.7));
		
		for (DoubleValued element: testSortedList) {
			System.out.println(element.getKey());
		}
		
	}

}
