package fr.carnavello.administration.commons.security.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fr.carnavello.administration.commons.security.api.ContextualPermission;
import fr.carnavello.administration.commons.security.api.NonContextualPermission;
import fr.carnavello.administration.commons.security.api.Permission;
import fr.carnavello.administration.commons.security.api.Role;

public class RoleImpl implements Role{

	
	private List<Permission> permissions;
	private String id;
	
	@Override
	public boolean hasPermission(String permissionId, Map context) 
	{
		Iterator<Permission> iterator = getPermissions().iterator();
		while (iterator.hasNext()) {
			Permission permission = iterator.next();
			if (permission.getId().compareTo(permissionId)==0)
			{
				if (permission instanceof ContextualPermission)
				{
					ContextualPermission contextualPermission = (ContextualPermission) permission;
					if (contextualPermission.hasContextualPermission(context))
					{
						return true;
					}
				}
				else if (permission instanceof NonContextualPermission)
				{
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public List<Permission> getPermissions() 
	{
		return permissions;
	}
	
	public void setPermissions(List<Permission> permissions) 
	{
		this.permissions=permissions;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Role : "+getId();
	}

}
