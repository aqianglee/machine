package com.aqiang.machine.unit;

import org.testng.annotations.Test;

import com.aqiang.machine.component.Power;

public class PowerTest {

	@Test
	public void testNewPower() {
		Power power = new Power(5.0);
		assert power.getVoltage() == 5;
	}
}
