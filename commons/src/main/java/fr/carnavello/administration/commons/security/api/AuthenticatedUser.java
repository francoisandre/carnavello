package fr.carnavello.administration.commons.security.api;

import java.util.List;
import java.util.Map;

public interface AuthenticatedUser extends User{

	String getFirstName();
	String getLastName();
	
	List<Role> getRoles();
	boolean hasPermission(String permissionId, Map context);
}
