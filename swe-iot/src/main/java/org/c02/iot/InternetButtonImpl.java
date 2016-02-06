package org.c02.iot;

import java.awt.Color;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class InternetButtonImpl implements InternetButtonApi {

	ParticleApiWrapper wrapper;

	public InternetButtonImpl(ParticleApiWrapper wrapperInstance) {
		wrapper = wrapperInstance;
	}

	public int getButtonCounter(ButtonDirection button) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setLed(int postition, Color color) throws ParticleException {
		// TODO Auto-generated method stub
		
		
		// nn = Position 01-12
		// rrr = rot
		// ggg = grün
		// bbb = blau
		String parameter = postition + "" + color.getRed() + "" + color.getGreen() + "" + color.getBlue();
		wrapper.callMethod("led",parameter);
	}

	public void allLedsOff() throws ParticleException {
		// TODO Auto-generated method stub
		//schaltet Leds ab
		wrapper.callMethod("ledsOff", null); 
	}

	public void playSound() throws ParticleException {
		// TODO Auto-generated method stub
		
		// play sound
		wrapper.callMethod("play", null); 

	}

	public void resetButtonCounters() {
		// TODO Auto-generated method stub
		
	}

}
