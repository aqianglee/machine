package com.aqiang.mechine.cpu.control;

import java.util.HashMap;
import java.util.Map;

public class RegisterConfig {
	public static Map<String, Register> registers = null;

	public static Map<String, Register> getConfig() {
		if (registers == null) {
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
		}
		return registers;
	}
}
