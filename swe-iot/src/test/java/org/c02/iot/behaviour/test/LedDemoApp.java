package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;
import java.awt.Color;

public class LedDemoApp {
	
	public static void main(String[] args) throws IOException, ParticleException, InterruptedException {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		InternetButtonImpl button = new InternetButtonImpl(wrapper);
		
		// Test erfolgreich wenn: InternetButton spielt Ton.
		button.setLed(3, new Color(0,20,20));
		Thread.sleep(1000);
		button.setLed(3, Color.ORANGE);
		Thread.sleep(1000);
		button.allLedsOff();
	}
	
}

