package com.gniot.crs.exception;

public class LoginException extends CRSException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException(String message) {
        super(message);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
