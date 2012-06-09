package org.visa.question;

import org.visa.question.converter.ConverseTime;
import org.visa.question.exceptions.InvalidTimeException;

public class ConversationalClock {
	
	private String conversedTime;

	public String convertTheTime(String time){
		try {
			ConverseTime converse = new ConverseTime(new Time(time.trim()));
			conversedTime = converse.getConversedTime();
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		return conversedTime;
	}

}
