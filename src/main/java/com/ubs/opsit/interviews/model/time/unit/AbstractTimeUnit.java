package com.ubs.opsit.interviews.model.time.unit;

import com.ubs.opsit.interviews.model.light.Light;
import com.ubs.opsit.interviews.util.Constant;

/**
 * The Class AbstractTimeUnit.
 */
public abstract class AbstractTimeUnit implements TimeUnit {

	/** The light matrix. */
	protected Light[][] lightMatrix;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.time.unit.TimeUnit#setTime(int)
	 */
	@Override
	public void setTime(int time) {
		int row1 = time / 5;
		int row2 = time % 5;

		for (int i = 0; i < row1; i++) {
			lightMatrix[0][i].swtichOn();
		}

		for (int i = 0; i < row2; i++) {
			lightMatrix[1][i].swtichOn();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.time.unit.TimeUnit#getTime()
	 */
	@Override
	public String getTime() {
		StringBuffer time = new StringBuffer();
		for (int i = 0; i < lightMatrix.length; i++) {
			Light[] lightRow = lightMatrix[i];
			for (int j = 0; j < lightRow.length; j++) {
				Light light = lightRow[j];
				time.append(light);
			}
			time.append(Constant.NEW_LINE_CHAR);
		}
		return time.toString();
	}
}
