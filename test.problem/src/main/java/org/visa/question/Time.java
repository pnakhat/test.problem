package org.visa.question;

import org.visa.question.exceptions.InvalidTimeException;

public class Time {

	private String time;

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
	}

	public String getTime() {
		return this.time;
	}

}
