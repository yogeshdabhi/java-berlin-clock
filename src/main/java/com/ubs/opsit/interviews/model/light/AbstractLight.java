package com.ubs.opsit.interviews.model.light;

import com.ubs.opsit.interviews.util.Constant;

/**
 * The Class AbstractLight.
 */
public abstract class AbstractLight implements Light {

	/** The state. */
	private String state;

	/**
	 * Instantiates a new abstract light.
	 */
	public AbstractLight() {
		this.swtichOff();
	}

	/**
	 * Sets the state.
	 *
	 * @param state
	 *            the new state
	 */
	protected void setState(String state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.Light#swtichOff()
	 */
	@Override
	public void swtichOff() {
		this.setState(Constant.OFF_SYMBOL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.state;
	}

}
