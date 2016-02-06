package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountAndShowLed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;
import org.junit.Test;

public class CountAndShowLedDemoApp {
	@Test
	public void TestCountAndShowLed() {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		InternetButtonImpl button = new InternetButtonImpl(wrapper);
		
		CountAndShowLed csl = new CountAndShowLed(button);
		csl.run();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, ParticleException {
		CountAndShowLedDemoApp app = new CountAndShowLedDemoApp();
		
		while(true){
		  app.TestCountAndShowLed();
		}
	}
}
