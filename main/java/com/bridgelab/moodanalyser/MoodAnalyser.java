package com.bridgelab.moodanalyser;

public class MoodAnalyser {
	String message;
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) {
		if(message.contains("sad")) {
			return "SAD";
		} else 
			return "HAPPY";
	}
	
	public String analyseMood() throws MoodAnalysisException{
		try {
		if(this.message.contains("sad")) {
			return "SAD";
		} else 
			return "HAPPY";
		} catch(NullPointerException e) {
			throw new MoodAnalysisException("Enter a proper Message");
		}
	}
}
