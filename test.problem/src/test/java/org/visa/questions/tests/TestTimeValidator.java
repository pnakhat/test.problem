package org.visa.questions.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.visa.question.TimeValidator;

public class TestTimeValidator {
	
	@Test
	public void testNoPeriodInTime(){
		TimeValidator tv = new TimeValidator("1220");
		Assert.assertEquals(false, tv.checkTimeHasPeriod());
	}
	
	@Test
	public void testValidPeriodInTime(){
		TimeValidator tv = new TimeValidator("12:20");
		Assert.assertEquals(true, tv.checkTimeHasPeriod());
	}
	
	
	@Test
	public void testInvalidLengthOfTime(){
		TimeValidator tv = new TimeValidator("12:201");
		Assert.assertEquals(false, tv.verifyLengthOfTime());
	}
	
	@Test
	public void testValidLengthOfTime(){
		TimeValidator tv = new TimeValidator("12:20");
		Assert.assertEquals(true, tv.verifyLengthOfTime());
	}
	
	
	@Test
	public void combinedValidatorTest(){
			TimeValidator tv = new TimeValidator("11:20");
			Assert.assertEquals(true, tv.validateTime());
	}
	
	@Test
	public void invalidValidatorTest(){
			TimeValidator tv = new TimeValidator("121:20");
			Assert.assertEquals(false, tv.validateTime());
	}


}
