package com.jdc.enc.api;

public class MessengerFactory {

	public static Messenger generate() {
		return new MessengerImpl();
	}
	
}
