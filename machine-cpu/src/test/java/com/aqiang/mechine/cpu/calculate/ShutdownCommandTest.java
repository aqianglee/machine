package com.aqiang.mechine.cpu.calculate;

import org.testng.annotations.Test;

import com.aqiang.mechine.cpu.control.Registers;

public class ShutdownCommandTest {

	@Test
	public void testExecute() {
		ShutdownCommand shutdownCommand = new ShutdownCommand();
		shutdownCommand.execute();
		assert "00000001".equals(Registers.SHUTDOWN_REGISTER.read());
	}

}
