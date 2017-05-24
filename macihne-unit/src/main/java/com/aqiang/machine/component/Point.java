package com.aqiang.machine.component;

public class Point extends Component {

	public Point() {
		super();
	}

	@Override
	public void update() {
		Double max = null;
		for (Lead lead : getLeads()) {
			if (max == null || lead.getVoltage() > max) {
				max = lead.getVoltage();
			}
		}
		setVoltage(max);
	}

	@Override
	public void draw() {

	}
}
