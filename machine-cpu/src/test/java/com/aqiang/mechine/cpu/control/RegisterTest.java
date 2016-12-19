package com.aqiang.mechine.cpu.control;

import org.testng.annotations.Test;

import com.aqiang.mechine.cpu.control.Register;
import com.aqiang.mechine.utils.DataUtils;

public class RegisterTest {

	@Test
	public void testRead() {
		Register register = new Register();
		register.write("00000100");
		assert "00000100".equals(register.read());
	}

	@Test
	public void testReadInt() {
		Register register = new Register();
		register.write("00000100");
		assert 4 == register.readInt();
	}

	@Test
	public void testReadChar() {
		Register register = new Register();
		register.write("01000010");
		assert 'B' == register.readChar();
	}

	@Test
	public void testWrite() {
		Register register = new Register();
		register.write("01000100");
		assert "01000100".equals(register.read());
	}

	@Test
	public void testWriteInt() {
		Register register = new Register();
		register.writeInt(16);
		assert "00000000000000000000000000010000".equals(register.read());
	}

	@Test
	public void testWriteChar() {
		Register register = new Register();
		register.writeChar('B');
		assert "01000010".equals(register.read());
	}

	@Test
	public void testReadAndWriteChar() {
		Register register = new Register();
		for (int i = 0; i <= 255; i++) {
			register.writeChar((char) i);
			assert (char) i == register.readChar();
		}
	}

	@Test
	public void testReadAndWriteInt() {
		Register register = new Register();
		for (int i = 0; i <= DataUtils.binary2Integer("01111111111111"); i++) {
			register.writeInt(i);
			assert i == register.readInt();
		}
	}

}
