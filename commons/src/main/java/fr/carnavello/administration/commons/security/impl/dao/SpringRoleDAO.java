package fr.carnavello.administration.commons.security.impl.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.carnavello.administration.commons.security.api.Role;
import fr.carnavello.administration.commons.security.api.User;
import fr.carnavello.administration.commons.security.api.dao.RoleDAO;

public class SpringRoleDAO implements RoleDAO {
	
	private Map<String, List<Role>> userRoles;

	@Override
	public List<Role> findRolesByUser(User user) 
	{
		List<Role> list = userRoles.get(user.getLogin());
		if (list == null)
		{
			list = new ArrayList<Role>();
		}
		return list;
	}

	public Map<String, List<Role>> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Map<String, List<Role>> userRoles) {
		this.userRoles = userRoles;
	}

}
