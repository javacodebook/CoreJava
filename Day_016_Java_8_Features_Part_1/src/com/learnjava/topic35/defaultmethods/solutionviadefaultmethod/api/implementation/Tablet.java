package com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.implementation;

import com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.DeviceAPI;

public class Tablet implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Android";
	}

	@Override
	public String getMaxResolution() {
		
		return "768";
	}

	@Override
	public String getBrand() {
		
		return "Samsung";
	}

}
