package com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.implementation;

import com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.DeviceAPI;

public class Laptop implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Windows";
	}

	@Override
	public String getMaxResolution() {
		
		return "1024";
	}

	@Override
	public String getBrand() {
		
		return "Dell";
	}
	
	@Override
	public boolean isBlueToothEnabled() {

		return true;
	}

}
