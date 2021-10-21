package com.bridgelab.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void whenGivenMessageIfContainsSadShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		assertEquals("SAD", result);
	}

	@Test
	public void whenGivenMessageIfNotContainSadShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in any mood");
		assertEquals("HAPPY", result);
	}

	@Test
	public void whenGivenNullInMessageShouldThroughUserDefinedException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals("Enter a proper Message", e.getMessage());
		}
	}
}
