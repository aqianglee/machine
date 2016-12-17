package com.aqiang.mechine.cpu.control;

import java.util.HashMap;
import java.util.Map;

import com.aqiang.mechine.cpu.calculate.Executeable;
import com.aqiang.mechine.cpu.calculate.ShutdownCommand;

public class CommandDecoder {
	private Map<String, Executeable> commands;
	public CommandDecoder() {
		commands = new HashMap<String, Executeable>();
		commands.put("00000000", new ShutdownCommand());
	}
	
	public Executeable findCommand(String command) {
		return commands.get(command);
	}
}
