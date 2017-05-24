package com.aqiang.machine.component;

public class ConnectUtils {
	public static void connect(Lead lead, Point point) {
		point.getLeads().add(lead);
		lead.setPoint(point);
		if (lead.getVoltage() == null) {
			lead.setVoltage(point.getVoltage());
		}
		if (point.getVoltage() == null) {
			point.setVoltage(lead.getVoltage());
		}
		for (Lead l : point.getLeads()) {
			if (l.getComponent() != null) {
				l.getComponent().update();
			}
		}
	}

	public static void addLead(Component component, Lead lead) {
		lead.setComponent(component);
		component.getLeads().add(lead);
	}
}
