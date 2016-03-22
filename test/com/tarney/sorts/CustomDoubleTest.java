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

public class CustomDoubleTest {

	@Test
	public void test() {
		
		double value = 0.5;
		CustomDouble doubleTest = new CustomDouble(value);
		assertThat(doubleTest.getKey(), is(value));
		
		CustomDouble doubleTest2 = new CustomDouble(value);
		assertThat(doubleTest.compareTo(doubleTest2), is(0));
		
		doubleTest2 = new CustomDouble(0.6);
		assertThat(doubleTest.compareTo(doubleTest2), is(-1));
		
		doubleTest2 = new CustomDouble(0.4);
		assertThat(doubleTest.compareTo(doubleTest2), is(1));
	}

}
