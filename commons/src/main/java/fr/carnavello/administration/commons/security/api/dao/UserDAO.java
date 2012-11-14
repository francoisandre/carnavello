package fr.carnavello.administration.commons.security.api.dao;

import java.util.List;

import fr.carnavello.administration.commons.security.api.User;

public interface UserDAO {
	
	List<User> findAll();
	User findUserByLogin(String login);

}
