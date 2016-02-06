package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;
import java.awt.Color;

public class ButtonCounterDemo {
	
	public static void main(String[] args) throws IOException, ParticleException, InterruptedException {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		InternetButtonImpl button = new InternetButtonImpl(wrapper);
		button.resetButtonCounters();
		int counter_east = button.getButtonCounter(ButtonDirection.East);
		int counter_west = button.getButtonCounter(ButtonDirection.West);
		int counter_south = button.getButtonCounter(ButtonDirection.South);
		int counter_north = button.getButtonCounter(ButtonDirection.North);
		
		if(counter_east == -1 || counter_west == -1 || counter_south == -1 || counter_north == -1)
			System.out.println("Invalid Parameter");
		else {
			System.out.println("Counter East:"+ counter_east);
			System.out.println("Counter West:"+ counter_west);
			System.out.println("Counter South:"+ counter_south);
			System.out.println("Counter North:"+ counter_north);
		}
		button.resetButtonCounters();
	}
	
}

