package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.Registers;

/**
 * 
 * @author administrator
 *
 */
public class LessThenCommand extends BaseCommand {

	@Override
	public void execute() {
		if (Registers.R02.readInt() < Registers.R03.readInt()) {
			Registers.CONDITION_REGISTER.write("00000000");
		} else {
			Registers.CONDITION_REGISTER.write("00000001");
		}
	}

	@Override
	public int size() {
		return 0;
	}

}
