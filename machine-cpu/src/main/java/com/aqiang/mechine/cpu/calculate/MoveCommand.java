package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.RegisterConfig;

/**
 * mov command length 4 <br>
 * 0-7 command tag 00000001<br>
 * 8-9 orientation 00 data2register 10 address2register 11 register2address<br>
 * if 00 8-15 register 16-31 data
 * 
 * @author kyo
 *
 */
public class MoveCommand extends BaseCommand {

	@Override
	public void execute() {
		String orientation = arg0.substring(0, 2);
		if ("00".equals(orientation)) {
			RegisterConfig.getConfig().get(arg0).write(arg1 + arg2);
		}
		if ("10".equals(orientation)) {

		}
		if ("11".equals(orientation)) {

		}
	}

	@Override
	public int size() {
		return 3;
	}

}
