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
	

	@Test
	public void testValidHourFormat(){
			TimeValidator tv = new TimeValidator("24:60");
			Assert.assertEquals(true, tv.verifyHourIsNotMoreThen24());
	}
	
	@Test
	public void testInvalidHourFormat(){
			TimeValidator tv = new TimeValidator("25:60");
			Assert.assertEquals(false, tv.verifyHourIsNotMoreThen24());
	}
	
	
	@Test
	public void testValidMinuteFormat(){
			TimeValidator tv = new TimeValidator("25:60");
			Assert.assertEquals(true, tv.verifyMinuteIsNotMoreThen60());
	}
	
	@Test
	public void testInvalidMinuteFormat(){
			TimeValidator tv = new TimeValidator("25:61");
			Assert.assertEquals(false, tv.verifyMinuteIsNotMoreThen60());
	}


}
