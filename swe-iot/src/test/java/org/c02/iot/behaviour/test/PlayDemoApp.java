package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;

public class PlayDemoApp {
	
	private static InternetButtonImpl button;
	
	public static void main(String[] args) throws IOException, ParticleException {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		new InternetButtonImpl(wrapper);
		
		// Test erfolgreich wenn: InternetButton spielt Ton.
		button.playSound();
		
	}
}
