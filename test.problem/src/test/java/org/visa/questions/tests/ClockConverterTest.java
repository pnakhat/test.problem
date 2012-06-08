package org.visa.questions.tests;

import org.junit.Test;
import org.visa.question.converter.ClockConverter;

import junit.framework.Assert;

public class ClockConverterTest {

	ClockConverter converter = new ClockConverter();

	@Test
	public void testMidnightScenario() {
		Assert.assertEquals("Midnight", converter.getConvertedTime(00, 00));
	}

	@Test
	public void testQuarterToMidnightScenario() {
		Assert.assertEquals("Quarter To Midnight",
				converter.getConvertedTime(23, 45));
	}

	@Test
	public void testQuarterToNonMidnightScenario() {
		Assert.assertEquals("Quarter To Nineteen",
				converter.getConvertedTime(18, 45));
	}

	@Test
	public void testQuarterPastScenario() {
		Assert.assertEquals("Quarter Past Six in evening",
				converter.getConvertedTime(18, 15));
	}

	@Test
	public void testJustPastScenario() {
		Assert.assertEquals("Just Past Midnight",
				converter.getConvertedTime(00, 1));
	}

	@Test
	public void testNoonScenario() {
		Assert.assertEquals("Noon", converter.getConvertedTime(12, 00));
	}

	@Test
	public void testToScenarioNonMidnight() {
		Assert.assertEquals("Ten To Five in evening",
				converter.getConvertedTime(16, 50));
	}

}
