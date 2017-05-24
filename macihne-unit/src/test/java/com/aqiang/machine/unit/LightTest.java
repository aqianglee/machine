package com.aqiang.machine.unit;

import java.util.List;

import org.testng.annotations.Test;

import com.aqiang.machine.component.ConnectUtils;
import com.aqiang.machine.component.Lead;
import com.aqiang.machine.component.Light;
import com.aqiang.machine.component.Point;

public class LightTest {
	@Test
	public void testLight() {
		Point pointH = new Point();
		pointH.setVoltage(5.0);
		Point pointL = new Point();
		pointL.setVoltage(0.0);
		assert pointH.getVoltage() == 5.0;
		assert pointL.getVoltage() == 0.0;
		Light light = new Light();
		List<Lead> leads = light.getLeads();
		assert leads.size() == 2;
		assert leads.get(0).getVoltage() == null;
		ConnectUtils.connect(leads.get(0), pointH);
		assert leads.get(0).getVoltage() == 5.0;
		assert leads.get(1).getVoltage() == null;
		ConnectUtils.connect(leads.get(1), pointL);
		assert leads.get(1).getVoltage() == 0.0;
		assert light.getLight();
	}
}
