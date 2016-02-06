package org.c02.iot.behaviour.test;

import java.awt.Color;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.behaviour.CountAndShowLed;
import org.junit.Assert;
import org.junit.Test;

public class BehaviourTest {
//Testkommentar
	@Test
	public void testBehaviour() {

		InternetButtonApi buttonInstance = new InternetButtonApi() {

			@Override
			public int getButtonCounter(ButtonDirection button) {
				if (button == ButtonDirection.North)
					return 5;
				return 0;
			}

			@Override
			public void resetButtonCounters() {
			//	Assert.fail();
			}

			@Override
			public void setLed(int postition, Color color) {
				Assert.assertEquals(5, postition);
				Assert.assertEquals(Color.GREEN, color);
			}

			@Override
			public void allLedsOff() {
			//	Assert.fail();
			}

			@Override
			public void playSound() {
			//	Assert.fail();
			}
		};

		CountAndShowLed beh = new CountAndShowLed(buttonInstance);

		beh.run();
	}
}
