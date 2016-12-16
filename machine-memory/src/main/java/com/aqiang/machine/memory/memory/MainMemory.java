package com.aqiang.machine.memory.memory;

public class MainMemory {
	private String[] memory = new String[1024];

	public String read(int location) {
		return memory[location];
	}

	public void write(int location, String data) {
		memory[location] = data;
	}
}
