package org.visa.question;

import org.visa.question.exceptions.InvalidTimeException;

public class Time {

	private String time;
	private int hour;
	private int minutes;

	public Time(String time) throws InvalidTimeException {

		TimeValidator tv = new TimeValidator(time);
		if (tv.validateTime()) {
			this.setTime(time);
		} else {
				throw new InvalidTimeException("Time is not valid");
			}
		}

	private void setTime(String time) {
		this.time = time;
		setHour();
		setMinutes();
	}

	public String getTime() {
		return this.time;
	}

	public int getHour() {
		return hour;
	}

	public void setHour() {
		this.hour = Integer.parseInt(time.split(":")[0]);
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes() {
		this.minutes = Integer.parseInt(time.split(":")[1]);
	}

}
