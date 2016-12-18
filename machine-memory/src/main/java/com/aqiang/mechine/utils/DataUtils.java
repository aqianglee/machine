package com.aqiang.mechine.utils;

import org.apache.commons.lang.StringUtils;

public class DataUtils {
	public static String integer2Binary8(int number) {
		return StringUtils.leftPad(Integer.toBinaryString(number), 8, "0");
	}

	public static String integer2Binary16(int number) {
		return StringUtils.leftPad(Integer.toBinaryString(number), 16, "0");
	}

	public static String integer2Binary32(int number) {
		return StringUtils.leftPad(Integer.toBinaryString(number), 32, "0");
	}

	public static int binary2Integer(String data) {
		return Integer.parseInt(data, 2);
	}
}
