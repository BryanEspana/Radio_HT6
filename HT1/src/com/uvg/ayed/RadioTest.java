package com.uvg.ayed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {

	@Test
	void testGetStatus() {
		Radio radio = new Radio();
		boolean R = false;
		boolean resultado = radio.getStatus();
		assertEquals(R, resultado);
		
	}
	
	@Test
	void testGetActualMode() {
		Radio radio = new Radio();
		int R = 0;
		int resultado = radio.getActualMode();
		assertEquals(R, resultado);
	}

	@Test
	void testSwitchButton() {
		fail("Not yet implemented");
		
		
	}

	

}
