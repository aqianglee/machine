package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.Registers;
import com.aqiang.mechine.utils.DataUtils;
/**
 * add command add r2 and r3 save at r2
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
