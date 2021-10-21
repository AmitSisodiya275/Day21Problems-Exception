package com.bridgelab.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.moodanalyser.InvalidEntryException.ExceptionType;

public class UserValidationTest {

	@Test
	public void whenGivenFirstNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstNameValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstNameValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.firstNameValidator("amit");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenLastNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastNameValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenLastNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastNameValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenLastNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.lastNameValidator("sisodiya");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumberValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumberValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.mobileNumberValidator("5264264");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenEmailEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.emailValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenEmailNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.emailValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenEmailWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.emailValidator("amit@gmail@.com.com");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenPasswordEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserValidation validator = new UserValidation();
		try {
			validator.passwordValidation("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenPasswordNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserValidation validator = new UserValidation();
		try {
			validator.passwordValidation(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenPasswordWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserValidation validator = new UserValidation();
		try {
			validator.passwordValidation("amit12");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

}
