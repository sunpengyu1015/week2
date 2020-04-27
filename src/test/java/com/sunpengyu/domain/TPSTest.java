package com.sunpengyu.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.sunpengyu.common.utils.DateUtil;
import com.sunpengyu.util.RandomUtil;
import com.sunpengyu.util.StringUtil1;

public class TPSTest {

	@Test
	public void test() {
		for (int i = 0; i < 100; i++) {
			TPS tps = new TPS();
			tps.setId(i+1);
			tps.setName(StringUtil1.getZHName());
			tps.setAge(RandomUtil.random(1, 100));
			tps.setPrice(RandomUtil.getValue(30000, 80000, 2));
			Calendar c = Calendar.getInstance();
			c.set(2012,1,1);
			tps.setDate(DateUtil.random(c.getTime(), new Date()));
			System.out.println(tps);
		}
		
		
		
		
	}

}
