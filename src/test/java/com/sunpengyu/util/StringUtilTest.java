package com.sunpengyu.util;

import org.junit.Test;

import com.sunpengyu.common.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testGetZHString() {
		String string = StringUtil.randomChineseString(5);
		System.out.println(string);
	}

	@Test
	public void testGetZHName() {
		
		String name = StringUtil.generateChineseName();
		System.out.println(name);
		
	}

}
