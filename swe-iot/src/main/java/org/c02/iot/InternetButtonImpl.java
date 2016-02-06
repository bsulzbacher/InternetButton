package org.c02.iot;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class InternetButtonImpl implements InternetButtonApi {

	ParticleApiWrapper wrapper;

	public InternetButtonImpl(ParticleApiWrapper wrapperInstance) {
		wrapper = wrapperInstance;
	}

	public int getButtonCounter(ButtonDirection button) throws IOException {
		// TODO Auto-generated method stub
		String param = "countButton";
		switch(button.name()){
			case "East": param = param + "3"; break;
			case "South": param = param + "2"; break;
			case "North": param = param + "1"; break;
			case "West": param = param + "4"; break;
			default: param = "-1";
		}
		
		if(param != "-1")
			return wrapper.readVariable(param);
		else
			return -1;
	}

	public void setLed(int postition, Color color) throws ParticleException {
		// TODO Auto-generated method stub
		
		
		// nn = Position 01-12
		// rrr = rot
		// ggg = grün
		// bbb = blau
		String parameter = postition + ", " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue();
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

	public void resetButtonCounters() throws ParticleException {
		// TODO Auto-generated method stub
		wrapper.callMethod("reset",null);
	}

	public void playMelodie() throws ParticleException, IOException, InterruptedException{
		int counter = 0;
		resetButtonCounters();
		int counter_east = getButtonCounter(ButtonDirection.East);
		int counter_west = getButtonCounter(ButtonDirection.West);
		int counter_south = getButtonCounter(ButtonDirection.South);
		int counter_north = getButtonCounter(ButtonDirection.North);
		counter = counter + counter_west + counter_east + counter_south + counter_north;
			
		if((counter % 10) == 0) {
			playSound();
		}
		counter = 0;
		resetButtonCounters();
	}
}
