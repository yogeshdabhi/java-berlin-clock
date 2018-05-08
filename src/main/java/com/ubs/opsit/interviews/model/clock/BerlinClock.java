package com.ubs.opsit.interviews.model.clock;

import com.ubs.opsit.interviews.model.time.unit.Hour;
import com.ubs.opsit.interviews.model.time.unit.Minute;
import com.ubs.opsit.interviews.model.time.unit.Second;

/**
 * The Class BerlinClock.
 */
public class BerlinClock extends AbstractClock implements Clock {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.clock.Clock#init()
	 */
	@Override
	public void init() {
		this.hour = new Hour();
		this.minute = new Minute();
		this.second = new Second();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.clock.Clock#validateTime(int, int,
	 * int)
	 */
	@Override
	public boolean validateTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 24) {
			throw new IllegalArgumentException("hours should be between 00 - 24");
		}
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("minutes should be between 00 - 59");
		}
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("seconds should be between of 00 - 59");
		}
		if (24 == hour && (minute != 0 || second != 0)) {
			throw new IllegalArgumentException("Hours can be 24 only in case of 24:00:00");
		}
		return true;
	}
}
