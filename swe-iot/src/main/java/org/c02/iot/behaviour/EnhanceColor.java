package org.c02.iot.behaviour;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.cloud.api.ParticleException;

public class EnhanceColor extends AbstractBehaviour {

		public EnhanceColor(InternetButtonApi buttonInstance) {
		super(buttonInstance);
		// TODO Auto-generated constructor stub
	}

		@Override
		public void run() {
			int buttonCounterNorth = 0;
			try {
				buttonCounterNorth = button.getButtonCounter(ButtonDirection.North);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//int buttonCounterSouth = button.getButtonCounter(ButtonDirection.South);
			//int buttonCounterEast = button.getButtonCounter(ButtonDirection.East);
			//int buttonCounterWest = button.getButtonCounter(ButtonDirection.West);
			
			try {
				if (buttonCounterNorth > 0){
					button.setLed(1, new Color(0,5,0));
				}
				
			} catch (ParticleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
