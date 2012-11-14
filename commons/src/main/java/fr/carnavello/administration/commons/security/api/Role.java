package fr.carnavello.administration.commons.security.api;

import java.util.List;
import java.util.Map;

public interface Role {

	boolean hasPermission(String permissionId, Map context);
	List<Permission> getPermissions();
	String getId();

}
