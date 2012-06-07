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
		int hourIn24Hr = Integer.parseInt(hour);
		int relativeMinute = Integer.parseInt(minute);
		return converter.getConvertedTime(hourIn24Hr, relativeMinute);
	}

}
