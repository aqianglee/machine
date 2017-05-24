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
		Double v = getLeads().get(0).getVoltage();
		Double v2 = getLeads().get(1).getVoltage();
		if (status) {
			if(v == null) {
				
			}
			if(v2 == null) {
				
			}
		}
	}

	@Override
	public void draw() {

	}

	public void switchStatus() {
		this.status = !status;
	}

}
