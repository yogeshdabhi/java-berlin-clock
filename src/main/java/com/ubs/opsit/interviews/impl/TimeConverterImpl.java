package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.model.clock.BerlinClock;
import com.ubs.opsit.interviews.model.clock.Clock;

/**
 * The Class TimeConverterImpl.
 */
public class TimeConverterImpl implements TimeConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		Clock clock = new BerlinClock();
		clock.init();
		clock.setTime(aTime);
		return clock.getTime();
	}

}
