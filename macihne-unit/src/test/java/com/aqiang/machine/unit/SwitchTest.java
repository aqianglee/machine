package com.aqiang.machine.unit;

import java.util.List;

import org.testng.annotations.Test;

import com.aqiang.machine.component.ConnectUtils;
import com.aqiang.machine.component.Lead;
import com.aqiang.machine.component.Point;
import com.aqiang.machine.component.Switch;

public class SwitchTest {

	@Test
	public void testSwitch() {
		Point pointH = new Point();
		pointH.setVoltage(5.0);
		Point pointL = new Point();
		Switch s = new Switch();
		List<Lead> leads = s.getLeads();
		assert leads.size() == 2;
		ConnectUtils.connect(leads.get(0), pointH);
		assert leads.get(0).getVoltage() == 5.0;
		assert leads.get(1).getVoltage() == null;
		ConnectUtils.connect(leads.get(1), pointL);
		assert leads.get(1).getVoltage() == null;
		assert pointL.getVoltage() == null;
		s.switchStatus();
		assert leads.get(1).getVoltage() == 5.0;
		assert pointL.getVoltage() == 5.0;
	}
}
