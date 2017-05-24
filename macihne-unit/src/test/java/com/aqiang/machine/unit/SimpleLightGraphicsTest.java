package com.aqiang.machine.unit;

import org.testng.annotations.Test;

import com.aqiang.machine.component.ConnectUtils;
import com.aqiang.machine.component.Light;
import com.aqiang.machine.component.Point;
import com.aqiang.machine.component.Power;

public class SimpleLightGraphicsTest {
	@Test
	public void test() {
		Power power = new Power(5.0);
		Light light = new Light();
		Point point = new Point();
		Point point2 = new Point();
		ConnectUtils.connect(power.getPositive(), point);
		ConnectUtils.connect(power.getNegative(), point2);
		ConnectUtils.connect(light.getLeads().get(0), point);
		ConnectUtils.connect(light.getLeads().get(1), point2);
		assert light.getLight();
	}
}
