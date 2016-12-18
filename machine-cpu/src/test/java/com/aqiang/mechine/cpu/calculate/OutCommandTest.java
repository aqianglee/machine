package com.aqiang.mechine.cpu.calculate;

import org.testng.annotations.Test;

public class OutCommandTest {

	@Test
	public void testExecute() {
		OutCommand command = new OutCommand();
		command.init("0000 0000 0000 0010");
		command.execute();
	}
}
