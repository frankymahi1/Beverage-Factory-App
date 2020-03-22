package com.beverage.factory.exception;

public class InValidOrderException extends RuntimeException {

	public InValidOrderException() {
		super();

	}

	public InValidOrderException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public InValidOrderException(String message, Throwable cause) {
		super(message, cause);

	}

	public InValidOrderException(String message) {
		super(message);

	}

	public InValidOrderException(Throwable cause) {
		super(cause);

	}

}
