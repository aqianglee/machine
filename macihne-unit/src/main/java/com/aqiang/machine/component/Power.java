package com.aqiang.machine.component;

public class Power extends Component {

	private Lead positive;
	private Lead negative;

	public Power() {

	}

	public Power(Double voltage) {
		positive = new Lead();
		negative = new Lead();
		this.setVoltage(voltage);
		update();
	}

	public Lead getPositive() {
		return positive;
	}

	public void setPositive(Lead positive) {
		this.positive = positive;
	}

	public Lead getNegative() {
		return negative;
	}

	public void setNegative(Lead negative) {
		this.negative = negative;
	}

	@Override
	public void update() {
		positive.setVoltage(this.getVoltage());
		negative.setVoltage(0.0);
	}

	@Override
	public void draw() {

	}

}
