package com.aqiang.mechine.cpu.control;

import com.aqiang.mechine.utils.DataUtils;

public class CommandAddressCreater {

	private static CommandAddressCreater creater = null;

	private CommandAddressCreater() {
	}

	public String getNextAddress() {
		String address = Registers.ADDRESS_REGISTER.read();
		genereteAddress();
		return address;
	}

	private void genereteAddress() {
		Registers.ADDRESS_REGISTER
				.write(DataUtils.integer2Binary16(DataUtils.binary2Integer(Registers.ADDRESS_REGISTER.read()) + 1));
	}

	public void jump(String address) {
		Registers.ADDRESS_REGISTER.write(address);
	}

	public void jump(int address) {
		Registers.ADDRESS_REGISTER.write(DataUtils.integer2Binary16(address));
	}

	public static CommandAddressCreater getCreater() {
		if (creater == null) {
			creater = new CommandAddressCreater();
		}
		return creater;
	}

}
