package org.qagile.question;

import org.qagile.question.converter.ConverseTime;
import org.qagile.question.exceptions.InvalidTimeException;

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
