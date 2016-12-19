package com.aqiang.mechine.cpu.control;

import com.aqiang.mechine.utils.DataUtils;

public class Register {
	private String data;

	public void write(String data) {
		this.data = data;
	}

	public void writeChar(char data) {
		write(DataUtils.integer2Binary8((int) data));
	}

	public void writeInt(int data) {
		write(DataUtils.integer2Binary32(data));
	}

	public String read() {
		if (data == null) {
			return "00000000000000000000000000000000";
		}
		return data;
	}

	public int readInt() {
		return DataUtils.binary2Integer(data);
	}

	public char readChar() {
		return (char) DataUtils.binary2Integer(data);
	}
}
