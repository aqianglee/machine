package com.aqiang.mechine.cpu.control;

import org.testng.annotations.Test;

import com.aqiang.mechine.cpu.control.RegisterConfig;

public class RegisterConfigTest {

	@Test
	public void test() {
		System.out.println(RegisterConfig.getConfig().get("00000010"));
	}

}
