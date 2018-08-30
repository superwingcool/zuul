package com.wing.zuul.exception;

public class RateLimiterException extends RuntimeException {

    public RateLimiterException(String message) {
        super(message);
    }
}
