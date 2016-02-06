package org.c02.iot;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.cloud.api.ParticleException;

public interface InternetButtonApi {

	public enum ButtonDirection {
		// Button:
		//1     2      3     4
		North, South, East, West
	}

	int getButtonCounter(ButtonDirection button) throws IOException;
	
	void resetButtonCounters() throws ParticleException;
	
	void setLed(int postition, Color color) throws ParticleException;
	
	void allLedsOff() throws ParticleException;
	
	// angepasst
	void playSound() throws ParticleException;
}
