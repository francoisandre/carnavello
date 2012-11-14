package fr.carnavello.administration.commons.security.impl;

import fr.carnavello.administration.commons.security.api.AuthenticatedUser;

public class AuthenticatedUserImpl extends UserImpl implements AuthenticatedUser {

	private String lastName;
	private String firstName;
	
	@Override
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
