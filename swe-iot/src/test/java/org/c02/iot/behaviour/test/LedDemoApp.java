package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;
import java.awt.Color;
import org.junit.Test;

public class LedDemoApp {
	@Test
	public void TestLed() throws IOException, ParticleException, InterruptedException {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		InternetButtonImpl button = new InternetButtonImpl(wrapper);
		
		// Test erfolgreich wenn: InternetButton spielt Ton.
		button.setLed(2, new Color(0,255,0));
		Thread.sleep(1000);
		button.setLed(3, Color.RED);
		Thread.sleep(1000);
		button.setLed(1, Color.GREEN);
		Thread.sleep(1000);
		button.allLedsOff();
	}
	
}

