package com.jdc.enc;

import com.jdc.enc.api.Messenger;
import com.jdc.enc.api.MessengerFactory;

public class MessengerDemo {

	public static void main(String[] args) {
		
		Messenger me = MessengerFactory.generate();
		
		me.send("Ko Hein");
		System.out.println(me.getClass());
		
	}
	
}
