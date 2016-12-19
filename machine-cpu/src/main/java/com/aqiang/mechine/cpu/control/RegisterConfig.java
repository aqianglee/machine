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
		}
		return registers;
	}
}
