package com.beverage.factory.exception;

public class NoMenuFoundException extends RuntimeException {

	public NoMenuFoundException() {
		super();

	}

	public NoMenuFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public NoMenuFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoMenuFoundException(String message) {
		super(message);
	}

	public NoMenuFoundException(Throwable cause) {
		super(cause);

	}

}
