package com.aqiang.machine.unit;

import org.testng.annotations.Test;

import com.aqiang.machine.component.ConnectUtils;
import com.aqiang.machine.component.Light;
import com.aqiang.machine.component.Point;
import com.aqiang.machine.component.Power;
import com.aqiang.machine.component.Switch;

public class SimpleLightGraphicsTest {
	@Test
	public void test() {
		Power power = new Power(5.0);
		Light light = new Light();
		Point point = new Point();
		Point point2 = new Point();
		Point point3 = new Point();
		Switch s = new Switch();
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == null;
		assert point2.getVoltage() == null;
		assert point3.getVoltage() == null;
		assert light.getLeads().get(0).getVoltage() == null;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == null;
		// 1
		ConnectUtils.connect(power.getPositive(), point);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;// power + connect with point
		assert point2.getVoltage() == null;
		assert point3.getVoltage() == null;
		assert light.getLeads().get(0).getVoltage() == null;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == null;
		// 2
		ConnectUtils.connect(power.getNegative(), point3);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point3.getVoltage() == 0.0;// power - connect with point3
		assert point2.getVoltage() == null;
		assert light.getLeads().get(0).getVoltage() == null;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == null;
		// 3
		ConnectUtils.connect(light.getLeads().get(0), point);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point3.getVoltage() == 0.0;
		assert light.getLeads().get(0).getVoltage() == 5.0;// light connect with
															// point
		assert point2.getVoltage() == null;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == null;
		// 4
		ConnectUtils.connect(light.getLeads().get(1), point2);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point3.getVoltage() == 0.0;
		assert light.getLeads().get(0).getVoltage() == 5.0;
		assert light.getLeads().get(1).getVoltage() == null;// light connect
															// with point2
		assert point2.getVoltage() == null;// light connect with point2
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == null;
		// 5
		ConnectUtils.connect(s.getLeads().get(1), point3);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point3.getVoltage() == 0.0;
		assert light.getLeads().get(0).getVoltage() == 5.0;
		assert light.getLeads().get(1).getVoltage() == null;
		assert point2.getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;
		assert s.getLeads().get(1).getVoltage() == 0.0;// switch connect with point2
		// 6
		ConnectUtils.connect(s.getLeads().get(0), point2);
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point2.getVoltage() == null;
		assert point3.getVoltage() == 0.0;
		assert light.getLeads().get(0).getVoltage() == 5.0;
		assert s.getLeads().get(1).getVoltage() == 0.0;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == null;

		s.switchStatus();
		assert power.getPositive().getVoltage() == 5.0;
		assert power.getNegative().getVoltage() == 0.0;
		assert point.getVoltage() == 5.0;
		assert point2.getVoltage() == 0.0;
		assert point3.getVoltage() == 0.0;
		assert light.getLeads().get(0).getVoltage() == 5.0;
		assert s.getLeads().get(1).getVoltage() == 0.0;
		assert light.getLeads().get(1).getVoltage() == null;
		assert s.getLeads().get(0).getVoltage() == 0.0;
	}
}
