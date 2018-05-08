package com.ubs.opsit.interviews.model.clock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ubs.opsit.interviews.model.time.unit.TimeUnit;
import com.ubs.opsit.interviews.util.Constant;

/**
 * The Class AbstractClock.
 */
public abstract class AbstractClock implements Clock {

	/** The second. */
	protected TimeUnit second;

	/** The hour. */
	protected TimeUnit hour;

	/** The minute. */
	protected TimeUnit minute;

	/** The input format. */
	private static Pattern INPUT_FORMAT = Pattern.compile(Constant.INPUT_PATTERN);

	/**
	 * Sets the time.
	 *
	 * @param hour
	 *            the hour
	 * @param minute
	 *            the minute
	 * @param second
	 *            the second
	 */
	private void setTime(int hour, int minute, int second) {
		this.second.setTime(second);
		this.hour.setTime(hour);
		this.minute.setTime(minute);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.clock.Clock#setTime(java.lang.String)
	 */
	@Override
	public void setTime(String time) {
		Matcher matcher = INPUT_FORMAT.matcher(time);
		if (matcher.matches()) {
			int hour = Integer.parseInt(matcher.group(1));
			int minute = Integer.parseInt(matcher.group(2));
			int second = Integer.parseInt(matcher.group(3));
			this.validateTime(hour, minute, second);
			this.setTime(hour, minute, second);
		} else {
			throw new IllegalArgumentException("Invalid Input");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.clock.Clock#getTime()
	 */
	@Override
	public String getTime() {
		StringBuilder time = new StringBuilder();
		time.append(this.second.getTime());
		time.append(this.hour.getTime());
		time.append(this.minute.getTime().trim());
		return time.toString();
	}

}
