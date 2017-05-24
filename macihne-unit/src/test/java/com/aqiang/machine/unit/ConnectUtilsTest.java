package com.aqiang.machine.unit;

import org.testng.annotations.Test;

import com.aqiang.machine.component.ConnectUtils;
import com.aqiang.machine.component.Point;
import com.aqiang.machine.component.Power;

public class ConnectUtilsTest {

	@Test
	public void testConnect() {
		Power power = new Power(5.0);
		Point point = new Point();
		ConnectUtils.connect(power.getPositive(), point);
		assert power.getVoltage() == 5.0;
		assert point.getVoltage() == 5.0;
	}

}
