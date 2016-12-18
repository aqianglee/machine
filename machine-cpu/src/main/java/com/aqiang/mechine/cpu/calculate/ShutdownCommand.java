package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.Registers;

public class ShutdownCommand extends BaseCommand {

	@Override
	public void execute() {
		System.out.println("machine shutdown!");
		Registers.SHUTDOWN_REGISTER.write("00000001");
	}

	@Override
	public int size() {
		return 0;
	}

}
