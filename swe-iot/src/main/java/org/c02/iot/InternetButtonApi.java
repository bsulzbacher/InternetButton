package org.c02.iot;

import java.awt.Color;

import org.c02.iot.cloud.api.ParticleException;

public interface InternetButtonApi {

	public enum ButtonDirection {
		// Button:
		//1     2      3     4
		North, South, East, West
	}

	int getButtonCounter(ButtonDirection button);
	
	void resetButtonCounters();
	
	void setLed(int postition, Color color);
	
	void allLedsOff();
	
	void playSound() throws ParticleException;
}
