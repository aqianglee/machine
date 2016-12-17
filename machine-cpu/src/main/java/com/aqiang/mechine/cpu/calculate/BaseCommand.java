package com.aqiang.mechine.cpu.calculate;

public abstract class BaseCommand implements Executeable {

	@Override
	public abstract void execute();

	public abstract int size();
	
	@Override
	public void init(String commandCode) {
		
	}
}
