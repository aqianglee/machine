package com.aqiang.machine.memory.memory;

import com.aqiang.mechine.utils.DataUtils;

public class MainMemory {
	private String[] memory = new String[1024];

	public String read(String address) {
		int location = DataUtils.binary2Integer(address);
		return memory[location];
	}

	public void write(String address, String data) {
		int location = DataUtils.binary2Integer(address);
		memory[location] = data;
	}
}
