package com.yajava.calculator;

public class ToLargeFactorialException extends Exception {
	
	public ToLargeFactorialException(String errorMessage) {
        super(errorMessage);
    }
}
