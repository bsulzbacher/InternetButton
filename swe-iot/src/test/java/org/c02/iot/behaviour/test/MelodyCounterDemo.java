package org.c02.iot.behaviour.test;

import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;
import org.junit.Test;

public class MelodyCounterDemo {
	
	@Test
	public void TestMelodyCounter() throws IOException, ParticleException, InterruptedException {
		ParticleApiWrapper wrapper = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);
		InternetButtonImpl button = new InternetButtonImpl(wrapper);
		button.playMelodie();
	}
	
}

