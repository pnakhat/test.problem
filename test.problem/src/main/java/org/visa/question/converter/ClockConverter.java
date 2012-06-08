package org.visa.question.converter;

import java.util.HashMap;
import java.util.Map;

public class ClockConverter {

	protected static HashMap<Integer, String> hourData;
	protected static HashMap<Integer, String> minuteData;
	private String convertedHour;
	private String converterdMinute;
	private String convertedTime;

	public ClockConverter() {
		/*
		 * The conversation grammer is set in the this method, if needed it can
		 * be changed to have more definition
		 */

		initConverseGrammer();
	}

	public String getConvertedTime(int hour, int minute) {
		String convertedTime = null;

		// Exactly Hour
		if (minute == 00) {
			convertedTime = exactHourCondition(hour);
		}
		// Quarter To Condition
		if (minute >= 45) {
			convertedTime = quarterToConversion(hour, minute);
		}

		// Quarter Past Scenario
		if (minute < 45 && minute > 0) {
			convertedTime = quarterPastConversion(hour, minute);
		}
		return convertedTime;
	}

	private String quarterPastConversion(int hour, int minute) {

		/*
		 * First conversation dictionary should be checked for any Translation
		 * otherwise normal number to word conversion be used
		 */
		convertedHour = hourData.get(hour) != null ? hourData.get(hour)
				: NumberToWordsConverter.convert(hour);
		converterdMinute = minuteData.get(minute) != null ? minuteData
				.get(minute) : NumberToWordsConverter.convert(minute);
		convertedTime = converterdMinute + " Past " + convertedHour;
		return convertedTime;
	}

	private String quarterToConversion(int hour, int minute) {
		int nextHour = getNextHour(hour);
		convertedHour = hourData.get(nextHour) != null ? hourData.get(nextHour)
				: NumberToWordsConverter.convert(nextHour);
		int minuteTo60 = 60 - minute;
		converterdMinute = minuteData.get(minuteTo60) != null ? minuteData
				.get(minuteTo60) : NumberToWordsConverter.convert(minuteTo60);
		convertedTime = converterdMinute + " To " + convertedHour;
		return convertedTime;
	}

	private String exactHourCondition(int hour) {
		convertedHour = hourData.get(hour) != null ? hourData.get(hour)
				: NumberToWordsConverter.convert(hour);
		convertedTime = convertedHour;
		return convertedTime;
	}

	private static int getNextHour(int hour) {
		if (hour + 1 >= 24) {
			return 0;
		} else {
			return hour + 1;
		}
	}

	private static void initConverseGrammer() {
		hourData = new HashMap<Integer, String>();
		minuteData = new HashMap<Integer, String>();
		hourData.put(00, "Midnight");
		hourData.put(12, "Noon");
		hourData.put(18, "Six in evening");
		hourData.put(22, "Ten in Night");
		minuteData.put(15, "Quarter");
		minuteData.put(30, "Half");
		minuteData.put(01, "Just");
	}

}
