package fr.carnavello.administration.commons.security.impl;

import fr.carnavello.administration.commons.security.api.NonContextualPermission;

public class NonContextualPermissionImpl implements NonContextualPermission{

	private String id;
	
	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Permission Non contextuelle : "+getId();
	}

}
