package com.oracle.demo01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
	public static int normalSort[]={2,3,4,5,8,11,66};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int a[]={3,2,4,66,11,5,8};
		BubbleSort.Bsort(a);
		assertArrayEquals(normalSort,a);
	
	}
	@Test
	public void testNormalSort() {
		int a[]={66,11,8,5,4,3,2};
		BubbleSort.Bsort(a);
		assertArrayEquals(normalSort,a);
	
	}

}
