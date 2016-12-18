package com.aqiang.mechine.cpu.calculate;

public abstract class BaseCommand implements Executeable {
	protected String arg0;
	protected String arg1;
	protected String arg2;

	@Override
	public abstract void execute();

	public abstract int size();

	@Override
	public void init(String commandCode) {
		commandCode = commandCode.replaceAll(" ", "");
		if (commandCode.length() > 8) {
			arg0 = commandCode.substring(8, 16);
		}
		if (commandCode.length() > 16) {
			arg1 = commandCode.substring(16, 24);
		}
		if (commandCode.length() > 24) {
			arg2 = commandCode.substring(24, 32);
		}
	}
}
