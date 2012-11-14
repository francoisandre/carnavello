package fr.carnavello.administration.commons.security.api;

import java.util.List;
import java.util.Map;

public interface User {

	String getLogin();
	
	List<Role> getRoles();
	boolean hasPermission(String permissionId, Map context);
}
