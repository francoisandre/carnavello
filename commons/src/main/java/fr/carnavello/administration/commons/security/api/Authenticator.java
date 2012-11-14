package fr.carnavello.administration.commons.security.api;

public interface Authenticator {
	
	public boolean isValid(String login, String password);

}
