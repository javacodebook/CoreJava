package com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.implementation;

import com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api.DeviceAPI;

public class AndroidTV implements DeviceAPI {

	@Override
	public String getOS() {
		
		return "Android";
	}

	@Override
	public String getMaxResolution() {
		
		return "5280";
	}

	@Override
	public String getBrand() {
		
		return "Samsung";
	}
	
	
}
