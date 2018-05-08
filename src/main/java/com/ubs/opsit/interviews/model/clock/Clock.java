package com.ubs.opsit.interviews.model.clock;

/**
 * The Interface Clock.
 */
public interface Clock {

	/**
	 * Inits the.
	 */
	public void init();

	/**
	 * Sets the time.
	 *
	 * @param time
	 *            the new time
	 */
	public void setTime(String time);

	/**
	 * Validate time.
	 *
	 * @param hour
	 *            the hour
	 * @param minute
	 *            the minute
	 * @param second
	 *            the second
	 * @return true, if successful
	 */
	public boolean validateTime(int hour, int minute, int second);

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime();

}
