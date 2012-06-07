package org.visa.question;

import org.visa.question.converter.ConverseTime;
import org.visa.question.exceptions.InvalidTimeException;

public class ConversationalClock {
	
	private String conversedTime;

	public String convertTheTime(String time){
		try {
			Time myTime = new Time(time);
			ConverseTime converse = new ConverseTime(myTime.getTime());
			conversedTime = converse.getConversedTime();
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		return conversedTime;
	}

}
