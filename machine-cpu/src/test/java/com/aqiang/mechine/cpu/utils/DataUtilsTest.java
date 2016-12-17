package com.aqiang.mechine.cpu.utils;

import org.testng.annotations.Test;

import com.aqiang.mechine.utils.DataUtils;

public class DataUtilsTest {

	@Test
	public void testDataUtils() {
		int i = DataUtils.binary2Integer("01010011");
		System.out.println(i);
	}

}
