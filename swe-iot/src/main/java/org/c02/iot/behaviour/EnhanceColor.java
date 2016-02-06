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
			int counter_north = 0;
			int counter_south = 0;
			int counter_east = 0;
			int counter_west = 0;
			
			int redcolor = 5;
			
			try {
				counter_north = button.getButtonCounter(ButtonDirection.North);
				counter_south = button.getButtonCounter(ButtonDirection.South);
				counter_east = button.getButtonCounter(ButtonDirection.East);
				counter_west = button.getButtonCounter(ButtonDirection.West);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int counter = (counter_north + counter_south + counter_east + counter_west);
			try {
				while (redcolor < 255){
					button.setLed(2, new Color(redcolor,0,0));
					redcolor += 10;
					
					if (redcolor >= 255){
						redcolor = 5;
					}
					
				}
				
				button.allLedsOff();
				
			} catch (ParticleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
}
