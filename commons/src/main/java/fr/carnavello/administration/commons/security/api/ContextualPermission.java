package fr.carnavello.administration.commons.security.api;

import java.util.Map;

public interface ContextualPermission extends Permission {
	
	boolean hasContextualPermission(Map context);

}
