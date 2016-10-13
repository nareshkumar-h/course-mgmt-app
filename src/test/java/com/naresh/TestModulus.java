package com.naresh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestModulus {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		ArithmeticUtil modulus = new ArithmeticUtil();
		assertEquals(0, modulus.mod(10, 2));
	}
}
