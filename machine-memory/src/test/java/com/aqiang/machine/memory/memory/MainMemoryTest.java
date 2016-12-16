package com.aqiang.machine.memory.memory;

import java.util.UUID;

import org.testng.annotations.Test;

public class MainMemoryTest {
	@Test
	public void testReadAndWrite() {
		MainMemory mainMemory = new MainMemory();
		for (int i = 0; i < 1024; i++) {
			String data = UUID.randomUUID().toString();
			mainMemory.write(i, data);
			assert data.equals(mainMemory.read(i));
			System.out.print(data);
		}
		System.out.println();
		for (int i = 0; i < 1024; i++) {
			System.out.print(mainMemory.read(i));
		}
		System.out.println();
	}

}
