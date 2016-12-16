package com.aqiang.mechine.cpu.control;

import com.aqiang.mechine.cpu.utils.DataUtils;

public class CommondAddressCreater {

	public String getNextAddress() {
		String address = Registers.R01.read();
		genereteAddress();
		return address;
	}

	private void genereteAddress() {
		Registers.R01.write(DataUtils.integer2Binary8(DataUtils.binary2Integer(Registers.R01.read()) + 1));
	}

	public void jump(String address) {
		Registers.R01.write(address);
	}

	public void jump(int address) {
		Registers.R01.write(DataUtils.integer2Binary8(address));
	}

}
