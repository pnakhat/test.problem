package org.qagile.questions.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.qagile.question.Time;
import org.qagile.question.converter.ConverseTime;
import org.qagile.question.exceptions.InvalidTimeException;

public class ConverseTimeTest {
	
	@Test
	public void testHalfPastConversion() throws InvalidTimeException{
		ConverseTime converse = new ConverseTime(new Time("12:30"));
		Assert.assertEquals("Half Past Noon", converse.getConversedTime());
	}
	

}
