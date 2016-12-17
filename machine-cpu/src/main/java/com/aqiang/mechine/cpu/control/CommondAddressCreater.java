package com.aqiang.mechine.cpu.control;

import com.aqiang.mechine.utils.DataUtils;

public class CommondAddressCreater {

	public String getNextAddress() {
		String address = Registers.ADDRESS_REGISTER.read();
		genereteAddress();
		return address;
	}

	private void genereteAddress() {
		Registers.ADDRESS_REGISTER.write(DataUtils.integer2Binary16(DataUtils.binary2Integer(Registers.ADDRESS_REGISTER.read()) + 1));
	}

	public void jump(String address) {
		Registers.ADDRESS_REGISTER.write(address);
	}

	public void jump(int address) {
		Registers.ADDRESS_REGISTER.write(DataUtils.integer2Binary16(address));
	}

}
