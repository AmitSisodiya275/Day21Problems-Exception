package com.bridgelab.moodanalyser;

import com.bridgelab.moodanalyser.MoodAnalysisException.ExceptionType;

public class MoodAnalyser {
	String message;
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
	}
	
	public String analyseMood() throws MoodAnalysisException{
		try {
			if(this.message.length() == 0) {
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "Please don't enter Empty message");
			}
		if(this.message.contains("sad")) {
			return "SAD";
		} else 
			return "HAPPY";
		} catch(NullPointerException e) {
			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "Please Enter valid message");
		}
	}
}
