package com.naresh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	@Test
	public void test() {
		Addition addition = new Addition();
		assertEquals(4, addition.add(2, 2));
	}

}
