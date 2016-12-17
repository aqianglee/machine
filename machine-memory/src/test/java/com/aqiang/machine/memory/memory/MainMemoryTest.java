package com.aqiang.machine.memory.memory;

import java.util.UUID;

import org.testng.annotations.Test;

public class MainMemoryTest {
	@Test
	public void testReadAndWrite() {
		MainMemory mainMemory = new MainMemory();
		for (int i = 0; i < 1024; i++) {
			String data = UUID.randomUUID().toString();
			String address = Integer.toBinaryString(i);
			mainMemory.write(address, data);
			assert data.equals(mainMemory.read(address));
			System.out.print(data);
		}
		System.out.println();
		for (int i = 0; i < 1024; i++) {
			System.out.print(mainMemory.read(Integer.toBinaryString(i)));
		}
		System.out.println();
	}

}
