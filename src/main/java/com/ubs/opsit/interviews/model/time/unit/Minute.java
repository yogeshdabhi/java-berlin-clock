package com.ubs.opsit.interviews.model.time.unit;

import com.ubs.opsit.interviews.model.light.Light;
import com.ubs.opsit.interviews.model.light.RedLight;
import com.ubs.opsit.interviews.model.light.YellowLight;

/**
 * The Class Minute.
 */
public class Minute extends AbstractTimeUnit implements TimeUnit {

	/**
	 * Instantiates a new minute.
	 */
	public Minute() {
		lightMatrix = new Light[2][];
		lightMatrix[0] = new Light[] { new YellowLight(), new YellowLight(), new RedLight(), 
								  new YellowLight(), new YellowLight(), new RedLight(), 
								  new YellowLight(), new YellowLight(), new RedLight(),
								  new YellowLight(), new YellowLight() };
		lightMatrix[1] = new Light[] { new YellowLight(), new YellowLight(), new YellowLight(), new YellowLight() };
	}
	
}
