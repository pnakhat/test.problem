package org.visa.question;
/* This class can have some more validators if needed*/
public class TimeValidator {

	private String time;

	public TimeValidator(String time) {
		this.time = time;
	}

	public boolean validateTime() {
		if (!checkTimeHasPeriod()) {
			System.out.println("Time is not valid its missing :");
			return false;
		}
		
		if (!verifyLengthOfTime()){
			System.out.println("Invalid time input : length is not right it should be five character");
			return false;
		}
		return true;
	}

	public boolean checkTimeHasPeriod() {
		if (time.contains(":")) {
			return true;
		}
		return false;
	}

	public boolean verifyLengthOfTime() {
		if (time.length() == 5) {
			return true;
		}
		return false;
	}

}
