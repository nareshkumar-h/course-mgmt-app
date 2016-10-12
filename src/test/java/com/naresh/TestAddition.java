package com.naresh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	@Test
	public void test() {
		assertEquals(4, Addition.add(2, 2));
	}

}
