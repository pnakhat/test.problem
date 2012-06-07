package org.visa.question.converter;


public class ConverseTime {

	private String hour;
	private String minute;

	public ConverseTime(String time) {
		this.hour = time.split(":")[0];
		this.minute = time.split(":")[1];
	}

	public String getConversedTime() {
		ClockConverter converter = new ClockConverter();
		int parsedHour = Integer.parseInt(hour);
		int parsedMinute = Integer.parseInt(minute);
		return converter.getConvertedTime(parsedHour, parsedMinute);
	}

}
