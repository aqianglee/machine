package com.aqiang.machine.component;

public class Switch extends Component {

	private Boolean status;

	public Switch() {
		this(false);
	}

	public Switch(Boolean status) {
		super();
		this.status = status;
		ConnectUtils.addLead(this, new Lead());
		ConnectUtils.addLead(this, new Lead());
	}

	@Override
	public void update() {
		Lead leadA = getLeads().get(0);
		Lead leadB = getLeads().get(1);
		if (status) {
			if (leadA.getVoltage() == null) {
				leadA.setVoltage(leadB.getVoltage());
			}
			if (leadB.getVoltage() == null) {
				leadB.setVoltage(leadA.getVoltage());
			}
		}
	}

	@Override
	public void draw() {

	}

	public void switchStatus() {
		this.status = !status;
		update();
	}

}
