package org.qagile.questions.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.qagile.question.Time;
import org.qagile.question.converter.NumberToWordsConverter;
import org.qagile.question.exceptions.InvalidTimeException;

public class TimeTest {
	
	@Test
	public void createValidTimeTest() throws InvalidTimeException{
		Time time = new Time("12:20");
		Assert.assertEquals("12:20", time.getTime());
	}

	
	
	@Test
	public void testExceptionIsThrown(){
		try {
			Time time = new Time("1220");
		} catch (InvalidTimeException e) {
			Assert.assertEquals("Time is not valid", e.getMessage());
		}
	}
	
	@Test
	public void numberToWordTest(){
		Assert.assertEquals("Forty Five", NumberToWordsConverter.convert(45));
	}

}
