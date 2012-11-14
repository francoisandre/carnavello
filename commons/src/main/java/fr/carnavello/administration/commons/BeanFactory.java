package fr.carnavello.administration.commons;

public interface BeanFactory {
	
	public static final String USER_DAO_BEAN_NAME = "userDAO";
	public static final String VERSION_DAO_BEAN_NAME = "versionDAO";
	public static final String PARAMETER_PROVIDER_LIST_BEAN_NAME = "parameterProviderList";
	
	
	Object getBeanByName(String beanName);

}
