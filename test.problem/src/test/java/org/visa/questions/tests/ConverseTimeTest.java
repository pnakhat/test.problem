package org.visa.questions.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.visa.question.Time;
import org.visa.question.converter.ConverseTime;
import org.visa.question.exceptions.InvalidTimeException;

public class ConverseTimeTest {
	
	@Test
	public void testHalfPastConversion() throws InvalidTimeException{
		ConverseTime converse = new ConverseTime(new Time("12:30"));
		Assert.assertEquals("Half Past Noon", converse.getConversedTime());
	}
	

}
