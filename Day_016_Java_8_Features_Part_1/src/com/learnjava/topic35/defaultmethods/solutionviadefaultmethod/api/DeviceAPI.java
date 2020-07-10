package com.learnjava.topic35.defaultmethods.solutionviadefaultmethod.api;

public interface DeviceAPI {
	
	String getOS();

	String getMaxResolution();

	String getBrand();
	
	default boolean isBlueToothEnabled(){
		return true;
	}

}
