package fr.carnavello.administration.commons.security.api.dao;

import java.util.List;

import fr.carnavello.administration.commons.security.api.Role;
import fr.carnavello.administration.commons.security.api.User;

public interface RoleDAO {
	
	List<Role> findRolesByUser(User user);

}
