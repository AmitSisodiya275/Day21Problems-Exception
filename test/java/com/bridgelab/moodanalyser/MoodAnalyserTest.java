package com.bridgelab.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.moodanalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyserTest {

	@Test
	public void whenGivenMessageIfContainsSadShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		assertEquals("SAD", result);
	}

	@Test
	public void whenGivenMessageIfNotContainSadShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in any mood");
		assertEquals("HAPPY", result);
	}

	@Test
	public void whenGivenNullInMessageShouldThrowUserDefinedException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals("Please Enter valid message", e.getMessage());
		}
	}
	
	@Test
	public void whenGivenNullInMessageShouldThrowUserDefinedExceptionWithTypeENTERED_NULL() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void whenGivenEmptyInMessageShouldThrowUserDefinedExceptionWithTypeENTERED_EMPTY() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
