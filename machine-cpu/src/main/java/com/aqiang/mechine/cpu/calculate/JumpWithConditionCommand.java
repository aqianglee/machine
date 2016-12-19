package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.CommandAddressCreater;
import com.aqiang.mechine.cpu.control.Registers;

/**
 * jump with condition command
 * 
 * @author administrator
 *
 */
public class JumpWithConditionCommand extends BaseCommand {

	@Override
	public void execute() {
		if (Registers.CONDITION_REGISTER.read().equals("00000000"))
			CommandAddressCreater.getCreater().jump(arg0);
	}

	@Override
	public int size() {
		return 1;
	}

}
