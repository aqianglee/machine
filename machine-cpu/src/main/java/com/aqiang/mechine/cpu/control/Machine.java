package com.aqiang.mechine.cpu.control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import com.aqiang.machine.memory.memory.Mamerys;
import com.aqiang.mechine.cpu.calculate.Executeable;
import com.aqiang.mechine.utils.DataUtils;

public class Machine {

	public void init() {
		Registers.ADDRESS_REGISTER.write("0000000000000000");
		try {
			URL resource = getClass().getClassLoader().getResource("rom.txt");
			BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()));
			String buffer = null;
			int address = 0;
			while ((buffer = reader.readLine()) != null) {
				Mamerys.mainMemory.write(DataUtils.integer2Binary16(address), buffer);
				address++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		Registers.SHUTDOWN_REGISTER.write("00000000");
		run();
	}

	public void run() {
		Executeable command = null;
		String commandCode = null;
		CommandAddressCreater creater = CommandAddressCreater.getCreater();
		while ("00000000".equals(Registers.SHUTDOWN_REGISTER.read())) {
			commandCode = Mamerys.mainMemory.read(creater.getNextAddress());
			command = CommandDecoder.getDecoder().findCommand(commandCode);
			if (command == null) {
				continue;
			}
			for (int i = 0; i < command.size(); i++) {
				commandCode += Mamerys.mainMemory.read(creater.getNextAddress());
			}
			command.init(commandCode);
			command.execute();
		}
	}

	public void shutdown() {
		Registers.SHUTDOWN_REGISTER.write("00000000");
	}
}
