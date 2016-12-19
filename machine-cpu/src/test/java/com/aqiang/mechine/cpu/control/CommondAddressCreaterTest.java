package com.aqiang.mechine.cpu.control;

import org.testng.annotations.Test;

public class CommondAddressCreaterTest {

	@Test
	public void testGetNextAddress() {
		CommandAddressCreater creater = CommandAddressCreater.getCreater();
		for (int i = 0; i < 100; i++) {
			String address = creater.getNextAddress();
			System.out.println(address);
			if (address.equals("00001111")) {
				creater.jump("00000000");
			}
		}
	}

}
