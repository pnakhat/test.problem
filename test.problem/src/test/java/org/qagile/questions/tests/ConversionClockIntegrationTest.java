package org.qagile.questions.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.qagile.question.ConversationalClock;

public class ConversionClockIntegrationTest {
	
	@Test
	public void testConversionClockEndToEnd(){
		ConversationalClock clock = new ConversationalClock();
		Assert.assertEquals("Twelve Past Ten in Night", clock.convertTheTime("22:12"));
	}

}
