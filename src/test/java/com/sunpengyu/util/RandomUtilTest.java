package com.sunpengyu.util;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testGetValue() {
		
		double d = RandomUtil.getValue(50.11,55.22, 2);
		System.out.println(d);
		
	}

	@Test
	public void testRandom() {
		
		int i = RandomUtil.random(1,3);
		System.out.println(i);
		
	}

}
