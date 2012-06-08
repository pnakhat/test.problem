package org.visa.question.converter;

import java.util.HashMap;
import java.util.Map;

public class ClockConverter {

	protected static HashMap<Integer, String> hourData;
	protected static HashMap<Integer, String> minuteData;
	private String convertedHour;

	public String getConvertedHour() {
		return convertedHour;
	}

	public void setConvertedHour(String convertedHour) {
		this.convertedHour = convertedHour;
	}

	public String getArticleToUse() {
		return articleToUse;
	}

	public void setArticleToUse(String articleToUse) {
		this.articleToUse = articleToUse;
	}

	private String converterdMinute;
	private String convertedTime;
	private int hourToConvert;

	public ClockConverter() {
		/*
		 * The conversation grammer is set in the this method, if needed it can
		 * be changed to have more definition
		 */
		initConverseGrammer();
	}

	public String getConverterdMinute() {
		return converterdMinute;
	}

	public void setConverterdMinute(String converterdMinute) {
		this.converterdMinute = converterdMinute;
	}

	public String getConvertedTime() {
		return convertedTime;
	}

	public void setConvertedTime(String convertedTime) {
		this.convertedTime = convertedTime;
	}

	public int getHourToConvert() {
		return hourToConvert;
	}

	public void setHourToConvert(int hourToConvert) {
		this.hourToConvert = hourToConvert;
	}

	public int getMinuteToConvert() {
		return minuteToConvert;
	}

	public void setMinuteToConvert(int minuteToConvert) {
		this.minuteToConvert = minuteToConvert;
	}

	private int minuteToConvert;
	private String articleToUse;

	public String getConvertedTime(int hour, int minute) {
		return calculateConverseTimeBasedOnHourMinute(hour, minute);
	}

	private String calculateConverseTimeBasedOnHourMinute(int hour, int minute) {
		setHourMinuteAndArticleToUse(hour, minute);

		setConvertedHour(hourData.get(getHourToConvert()) != null ? hourData
				.get(getHourToConvert()) : NumberToWordsConverter
				.convert(getHourToConvert()));
		setConverterdMinute(minuteData.get(getMinuteToConvert()) != null ? minuteData
				.get(getMinuteToConvert()) : NumberToWordsConverter
				.convert(getMinuteToConvert()));
		setConvertedTime(getConverterdMinute() + getArticleToUse()
				+ getConvertedHour());

		return getConvertedTime();
	}

	private void setHourMinuteAndArticleToUse(int hour, int minute) {
		if (minute >= 45) {
			setHourToConvert(getNextHour(hour));
			setMinuteToConvert(60 - minute);
			setArticleToUse(" To ");
		} else if (minute < 45 && minute > 0) {
			setHourToConvert(hour);
			setMinuteToConvert(minute);
			setArticleToUse(" Past ");
		} else {
			setHourToConvert(hour);
			setMinuteToConvert(0);
			setArticleToUse("");
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
		hourData.put(17, "Five in evening");
		minuteData.put(15, "Quarter");
		minuteData.put(30, "Half");
		minuteData.put(01, "Just");
		minuteData.put(00, "");
	}

}
