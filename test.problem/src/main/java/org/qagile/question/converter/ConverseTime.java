package org.qagile.question.converter;

import org.qagile.question.Time;


public class ConverseTime {

	private int hour;
	private int minute;

	public ConverseTime(Time time) {
		this.hour = time.getHour();
		this.minute = time.getMinutes();
	}

	public String getConversedTime() {
		ClockConverter converter = new ClockConverter();
		return converter.getConvertedTime(hour, minute);
	}

}
