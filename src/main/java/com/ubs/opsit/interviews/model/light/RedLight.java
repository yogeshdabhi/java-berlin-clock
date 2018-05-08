package com.ubs.opsit.interviews.model.light;

import com.ubs.opsit.interviews.util.Constant;

/**
 * The Class RedLight.
 */
public class RedLight extends AbstractLight implements Light {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ubs.opsit.interviews.model.Light#swtichOn()
	 */
	@Override
	public void swtichOn() {
		this.setState(Constant.ON_SYMBOL_RED);
	}

}
