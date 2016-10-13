package com.naresh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSubtraction {

@Test
	public void test() {
		ArithmeticUtil util = new ArithmeticUtil();
		assertEquals(4, util.sub(6, 2));
	}

}
