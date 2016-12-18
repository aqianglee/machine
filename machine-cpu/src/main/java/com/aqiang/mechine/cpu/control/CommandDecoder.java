package com.aqiang.mechine.cpu.control;

import java.util.HashMap;
import java.util.Map;

import com.aqiang.mechine.cpu.calculate.AddCommand;
import com.aqiang.mechine.cpu.calculate.Executeable;
import com.aqiang.mechine.cpu.calculate.MoveCommand;
import com.aqiang.mechine.cpu.calculate.OutCommand;
import com.aqiang.mechine.cpu.calculate.ShutdownCommand;

public class CommandDecoder {
	private Map<String, Executeable> commands;
	private static CommandDecoder decoder;

	private CommandDecoder() {
		commands = new HashMap<String, Executeable>();
		commands.put("00000000", new ShutdownCommand());
		commands.put("00000001", new MoveCommand());
		commands.put("00000010", new AddCommand());
		commands.put("00000011", new OutCommand());
	}

	public Executeable findCommand(String command) {
		return commands.get(command);
	}

	public static CommandDecoder getDecoder() {
		if (decoder == null) {
			decoder = new CommandDecoder();
		}
		return decoder;
	}
}
