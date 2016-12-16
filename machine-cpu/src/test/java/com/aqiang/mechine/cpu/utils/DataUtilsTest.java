package com.aqiang.mechine.cpu.utils;

import org.testng.annotations.Test;

public class DataUtilsTest {

	@Test
	public void testDataUtils() {
		int i = DataUtils.binary2Integer("01010011");
		System.out.println(i);
	}

}
