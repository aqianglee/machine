package com.aqiang.mechine.cpu.calculate;

import com.aqiang.mechine.cpu.control.RegisterConfig;

/**
 * out command tag 00000011<br>
 * size 1<br>
 * arg0 is register name<br>
 * 
 * @author kyo
 *
 */
public class OutCommand extends BaseCommand {

	@Override
	public void execute() {
		System.out.println(RegisterConfig.getConfig().get(arg0).read());
	}

	@Override
	public int size() {
		return 1;
	}
}
