package com.ubs.opsit.interviews.model.time.unit;

import com.ubs.opsit.interviews.model.light.Light;
import com.ubs.opsit.interviews.model.light.RedLight;

/**
 * The Class Hour.
 */
public class Hour extends AbstractTimeUnit implements TimeUnit {

	/**
	 * Instantiates a new hour.
	 */
	public Hour() {
		lightMatrix = new Light[2][];
		lightMatrix[0] = new Light[] { new RedLight(), new RedLight(), new RedLight(), new RedLight() };
		lightMatrix[1] = new Light[] { new RedLight(), new RedLight(), new RedLight(), new RedLight() };
	}

}
