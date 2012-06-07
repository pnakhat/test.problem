package org.visa.question.converter;


public class ConverseTime {

	private int hour;
	private int minute;

	public ConverseTime(String time) {
		this.hour = Integer.parseInt(time.split(":")[0]);
		this.minute = Integer.parseInt(time.split(":")[1]);
	}

	public String getConversedTime() {
		ClockConverter converter = new ClockConverter();
		return converter.getConvertedTime(hour, minute);
	}

}
