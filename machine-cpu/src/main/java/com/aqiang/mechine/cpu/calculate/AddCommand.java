package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.Registers;
import com.aqiang.mechine.utils.DataUtils;

/**
 * add command tag 00000010<br>
 * size 0<br>
 * 
 * @author kyo
 *
 */
public class AddCommand extends BaseCommand {

	@Override
	public void execute() {
		Registers.R02.write(DataUtils.integer2Binary32(
				DataUtils.binary2Integer(Registers.R02.read()) + DataUtils.binary2Integer(Registers.R03.read())));
	}

	@Override
	public int size() {
		return 0;
	}

}
