package com.aqiang.machine.component;

public class Light extends Component {

	private Boolean light;

	public Light() {
		ConnectUtils.addLead(this, new Lead());
		ConnectUtils.addLead(this, new Lead());
	}

	public Boolean getLight() {
		return light;
	}

	public void setLight(Boolean light) {
		this.light = light;
	}

	@Override
	public void update() {
		Double leadA = getLeads().get(0).getVoltage();
		Double leadB = getLeads().get(1).getVoltage();
		if (leadA != null && leadB != null && Math.abs(leadA - leadB) > 0) {
			light = true;
		} else {
			light = false;
		}
	}

	@Override
	public void draw() {

	}

}
