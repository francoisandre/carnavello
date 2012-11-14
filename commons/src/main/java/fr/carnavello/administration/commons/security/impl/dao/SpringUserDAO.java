package fr.carnavello.administration.commons.security.impl.dao;

import java.util.Iterator;
import java.util.List;

import fr.carnavello.administration.commons.security.api.User;
import fr.carnavello.administration.commons.security.api.dao.UserDAO;


public class SpringUserDAO implements UserDAO
{
	private List<User> users; 

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findUserByLogin(String login) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getLogin().compareTo(login)==0)
			{
				return user;
			}
		}
		return null;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}