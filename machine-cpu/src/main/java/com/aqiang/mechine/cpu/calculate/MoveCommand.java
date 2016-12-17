package com.aqiang.mechine.cpu.calculate;

import java.util.HashMap;
import java.util.Map;

import com.aqiang.mechine.cpu.control.Register;
import com.aqiang.mechine.cpu.control.Registers;

/**
 * mov command length 4 <br>
 * 0-7 command tag <br>
 * 8-9 orientation 00 data2register 10 address2register 11 register2address<br>
 * if 00 8-15 register 16-31 data
 * 
 * @author kyo
 *
 */
public class MoveCommand extends BaseCommand {

	private String arg0;
	private String arg1;
	private String arg2;

	private Map<String, Register> registers;

	@Override
	public void execute() {
		String orientation = arg0.substring(8, 9);
		if ("00".equals(orientation)) {
			registers.get(arg0).write(arg1 + arg2);
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

	@Override
	public void init(String commandCode) {
		registers = new HashMap<String, Register>();
		registers.put("00000010", Registers.R02);
		registers.put("00000011", Registers.R03);
		registers.put("00000100", Registers.R04);
		registers.put("00000101", Registers.R05);
		registers.put("00000110", Registers.R06);
		registers.put("00000111", Registers.R07);
		registers.put("00001000", Registers.R08);
		registers.put("00001001", Registers.R09);
		registers.put("00001010", Registers.R10);

		commandCode = commandCode.replaceAll(" ", "");
		System.out.println(commandCode);
		arg0 = commandCode.substring(8, 15);
		arg1 = commandCode.substring(16, 23);
		arg2 = commandCode.substring(24, 31);
	}

}
