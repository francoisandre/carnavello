package fr.carnavello.administration.commons;

import fr.carnavello.administration.commons.security.api.User;
import fr.carnavello.administration.commons.security.api.dao.UserDAO;
import fr.carnavello.administration.commons.spring.SpringBeanFactory;


public class Application 
{
	private static final String DEFAULT_USER_LOGIN = "defaultUserLogin";
	private BeanFactory beanFactory;
	protected static Application instance;
	
	private User defaultUser; 
	
	protected Application()
	{
		
	}
	
	

	public BeanFactory getBeanFactory() 
	{
		if (beanFactory == null)
		{
			beanFactory = new SpringBeanFactory();
		}
		return beanFactory;
	}
	
	public void start()
	{
		
	}
	
	public void stop()
	{
		
	}
	
	public static Application getInstance() 
	{
		if (instance == null)
		{
			instance = new Application();
		}
		return instance;	
	}



	public UserDAO getUserDAO() 
	{
		return (UserDAO) getBeanFactory().getBeanByName(BeanFactory.USER_DAO_BEAN_NAME);
	}
	
	public User getDefaultUser() 
	{
		return getUserDAO().findUserByLogin(DEFAULT_USER_LOGIN);
	}

	
	
}
