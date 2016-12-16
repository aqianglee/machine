package com.aqiang.mechine.cpu.control;

public class Register {
	private String data;

	public void write(String data) {
		this.data = data;
	}

	public String read() {
		if (data == null) {
			return "00000000000000000000000000000000";
		}
		return data;
	}
}
