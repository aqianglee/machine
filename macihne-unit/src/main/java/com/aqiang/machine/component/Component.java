package com.aqiang.machine.component;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	private String label;
	private Integer x;
	private Integer y;
	private Integer w;
	private Integer h;
	private Double voltage;
	private Double electric;
	private List<Lead> leads;

	public Component() {
		leads = new ArrayList<>();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getW() {
		return w;
	}

	public void setW(Integer w) {
		this.w = w;
	}

	public Integer getH() {
		return h;
	}

	public void setH(Integer h) {
		this.h = h;
	}

	public Double getVoltage() {
		return voltage;
	}

	public void setVoltage(Double voltage) {
		this.voltage = voltage;
	}

	public Double getElectric() {
		return electric;
	}

	public void setElectric(Double electric) {
		this.electric = electric;
	}

	public List<Lead> getLeads() {
		return leads;
	}

	public void setLeads(List<Lead> leads) {
		this.leads = leads;
	}

	public abstract void update();

	public abstract void draw();
}
