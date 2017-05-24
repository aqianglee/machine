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
		this.voltage = voltage;
		if (point != null) {
			List<Lead> leads = point.getLeads();
			point.update();
			for (Lead lead : leads) {
				if (lead.getComponent() != null) {
					lead.getComponent().update();
				}
			}
		}
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
