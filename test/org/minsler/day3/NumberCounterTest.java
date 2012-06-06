package org.minsler.day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCounterTest {

	@Test
	public void testGetNumber() {
		NumberCounter number = new NumberCounter(20230234L);
		assertEquals("Result", 20230234, number.getNumber());
	}

	@Test
	public void testGetMaxNumber() {
		NumberCounter number = new NumberCounter(20230234L);
		assertEquals("Result", 2, number.getMaxNumber());
	}

	@Test
	public void testGetMaxCount() {
		NumberCounter number = new NumberCounter(20230234L);
		assertEquals("Result", 3, number.getMaxCount());
	}

}
