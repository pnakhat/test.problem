package org.visa.question.converter;

import java.util.HashMap;
import java.util.Map;

public class ClockConverter {

	protected static HashMap<Integer, String> hourData;
	protected static HashMap<Integer, String> minuteData;
	private String convertedHour;
	private String converterdMinute;
	private String convertedTime;
	private int hourToConvert;
	private int minuteToConvert;
	private String articleToUse;

	public ClockConverter() {
		/*
		 * The conversation grammer is set in the this method, if needed it can
		 * be changed to have more definition
		 */
		initConverseGrammer();
	}

	public String getConvertedTime(int hour, int minute) {
		return calculateConverseTimeBasedOnHourMinute(hour, minute);
	}

	private String calculateConverseTimeBasedOnHourMinute(int hour, int minute) {
		setHourMinuteAndArticleToUse(hour, minute);

		convertedHour = hourData.get(hourToConvert) != null ? hourData
				.get(hourToConvert) : NumberToWordsConverter
				.convert(hourToConvert);
		converterdMinute = minuteData.get(minuteToConvert) != null ? minuteData
				.get(minuteToConvert) : NumberToWordsConverter
				.convert(minuteToConvert);

		convertedTime = converterdMinute + articleToUse + convertedHour;
		return convertedTime;
	}

	private void setHourMinuteAndArticleToUse(int hour, int minute) {
		if (minute >= 45) {
			hourToConvert = getNextHour(hour);
			minuteToConvert = 60 - minute;
			articleToUse = " To ";
		} else if (minute < 45 && minute > 0) {
			hourToConvert = hour;
			minuteToConvert = minute;
			articleToUse = " Past ";
		} else {
			hourToConvert = hour;
			minuteToConvert = 0;
			articleToUse = "";
		}
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
		minuteData.put(00, "");
	}

}
