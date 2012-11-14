package fr.carnavello.administration.commons.security.api;

public class SecuritySystemException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6933873224719886095L;
	
	public SecuritySystemException(String message, Exception originalException)
	{
		super(message, originalException);
	}

	public SecuritySystemException(String message) 
	{
		super(message);
	}
	
}
