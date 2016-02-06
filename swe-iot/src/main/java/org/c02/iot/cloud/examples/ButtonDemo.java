package org.c02.iot.cloud.examples;

import java.io.IOException;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;

public class ButtonDemo {

	static ParticleApiWrapper api = new ParticleApiWrapperImpl(DemoConstants.deviceId, DemoConstants.accessToken);

	public static void main(String[] args) throws IOException, InterruptedException, ParticleException {

		// auslesen der Tastendrucke von Button 1 (1 Punkt) countButton2 mit 2
		// Punkten usw...
		System.out.println(api.readVariable("countButton1"));
		System.out.println(api.readVariable("countButton2"));
		System.out.println(api.readVariable("countButton3"));
		System.out.println(api.readVariable("countButton4"));

		Thread.sleep(2000);
		api.callMethod("reset",null);
		System.out.println(api.readVariable("countButton1"));
		System.out.println(api.readVariable("countButton2"));
		System.out.println(api.readVariable("countButton3"));
		System.out.println(api.readVariable("countButton4"));


		api.callMethod("reset",null);

		System.out.println(api.readVariable("countButton1"));
		System.out.println(api.readVariable("countButton2"));
		System.out.println(api.readVariable("countButton3"));
		System.out.println(api.readVariable("countButton4"));
	}

}
