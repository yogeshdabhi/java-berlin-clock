package com.ubs.opsit.interviews.model.time.unit;

import com.ubs.opsit.interviews.model.light.Light;
import com.ubs.opsit.interviews.model.light.YellowLight;

/**
 * The Class Second.
 */
public class Second extends AbstractTimeUnit implements TimeUnit {

	/**
	 * Instantiates a new second.
	 */
	public Second() {
		lightMatrix = new Light[1][];
		lightMatrix[0] = new Light[] { new YellowLight() };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ubs.opsit.interviews.model.time.unit.AbstractTimeUnit#setTime(int)
	 */
	@Override
	public void setTime(int time) {
		if (time % 2 == 0) {
			lightMatrix[0][0].swtichOn();
		}
	}
}
