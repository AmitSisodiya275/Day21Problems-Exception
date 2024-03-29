package com.bridgelab.moodanalyser;

public class MoodAnalysisException extends Exception {
	ExceptionType type;

	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY;
	}

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
