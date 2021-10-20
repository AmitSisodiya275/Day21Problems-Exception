package com.bridgelab.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test 
	public void whenGivenMessageIfContainsSadShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in sad mood");
		assertEquals("SAD",result);
	}
	
	@Test 
	public void whenGivenMessageIfNotContainSadShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood("I am in any mood");
		assertEquals("HAPPY",result);
	}
	
	@Test 
	public void whenGivenMessageInTheConstructorIfContainsSadShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String result = moodAnalyser.analyseMood();
		assertEquals("SAD",result);
	}
	
	@Test 
	public void whenGivenMessageInTheConstructorIfNotContainSadShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
		String result = moodAnalyser.analyseMood();
		assertEquals("HAPPY",result);
	}
	@Test 
	public void whenGivenNullInMessageShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String result = moodAnalyser.analyseMood();
		assertEquals("HAPPY",result);
	}
}
