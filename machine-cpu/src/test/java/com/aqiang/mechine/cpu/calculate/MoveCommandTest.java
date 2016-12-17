package com.aqiang.mechine.cpu.calculate;

import org.testng.annotations.Test;

import com.aqiang.mechine.cpu.control.Registers;

public class MoveCommandTest {
	
	@Test
	public void testExecute() {
		MoveCommand command = new MoveCommand();
		command.init("0000 0000 0000 0010 0101 0000 1111 0000");
		command.execute();
		assert Registers.R02.equals("0101000011110000");
	}
}
