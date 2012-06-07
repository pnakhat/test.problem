package org.visa.question;

public class ConversationalClockUsage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConversationalClock clock = new ConversationalClock();
		
		//Eleven Past Noon
		System.out.println(clock.convertTheTime("12:11"));
		//Thirty One Past Ten
		System.out.println(clock.convertTheTime("10:31"));
		//Twenty Four
		System.out.println(clock.convertTheTime("24:00"));
		//Eleven Past Eight
		System.out.println(clock.convertTheTime("08:11"));
		//Eleven Past Ten
		System.out.println(clock.convertTheTime("10:11"));
		//Eleven Past Eleven
		System.out.println(clock.convertTheTime("11:11"));
		//Eleven Past Noon
		System.out.println(clock.convertTheTime("12:11"));
		//Midnight
		System.out.println(clock.convertTheTime("00:00"));
		//Just Past Midnight
		System.out.println(clock.convertTheTime("00:01"));
		//Five Past Midnight
		System.out.println(clock.convertTheTime("00:05"));
		//Ten To Midnight
		System.out.println(clock.convertTheTime("23:50"));
		//Quarter Past Twenty Three
		System.out.println(clock.convertTheTime("23:15"));
		//Quarter To Midnight
		System.out.println(clock.convertTheTime("23:45"));
	
		

	}

}
