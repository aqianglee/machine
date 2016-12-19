package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.CommandAddressCreater;

/**
 * jump command
 * 
 * @author administrator
 *
 */
public class JumpCommand extends BaseCommand {

	@Override
	public void execute() {
		CommandAddressCreater.getCreater().jump(arg0);
	}

	@Override
	public int size() {
		return 1;
	}

}
