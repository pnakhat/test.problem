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
		
		if (!verifyHourIsNotMoreThen24()){
			System.out.println("Invalid time input : Hour is more then 24");
			return false;
		}
		
		if (!verifyMinuteIsNotMoreThen60()){
			System.out.println("Invalid time input : Minute is more then 60");
			return false;
		}
		return true;
	}

	public boolean verifyHourIsNotMoreThen24() {
		int hour = Integer.parseInt(time.split(":")[0]);
		if(hour > 24){
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

	public boolean verifyMinuteIsNotMoreThen60() {
		int minute = Integer.parseInt(time.split(":")[1]);
		if(minute > 60){
			return false;
		}
		return true;
	}

}
