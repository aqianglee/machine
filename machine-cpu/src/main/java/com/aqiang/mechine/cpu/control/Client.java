package com.aqiang.mechine.cpu.control;

public class Client {
	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.init();
		machine.start();
	}
}
