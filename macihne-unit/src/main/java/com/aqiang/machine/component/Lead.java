package com.aqiang.machine.component;

import java.util.List;

public class Lead {
	private Double voltage;
	private Point point;
	private Component component;

	public Double getVoltage() {
		return voltage;
	}

	public void setVoltage(Double voltage) {
		List<Lead> leads = point.getLeads();
		for (Lead lead : leads) {
			if (!lead.equals(this)) {
				lead.getComponent().update();
			}
		}
		this.voltage = voltage;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

}
