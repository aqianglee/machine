package com.aqiang.machine.component;

import java.util.ArrayList;
import java.util.List;

public class Point extends Component {

	private List<Lead> leads;

	public Point() {
		leads = new ArrayList<Lead>();
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw() {

	}

	public List<Lead> getLeads() {
		return leads;
	}

	public void setLeads(List<Lead> leads) {
		this.leads = leads;
	}

}
