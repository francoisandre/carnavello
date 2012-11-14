package fr.carnavello.administration.commons.spring;

import fr.carnavello.administration.commons.BeanFactory;

public class SpringBeanFactory implements BeanFactory {

	@Override
	public Object getBeanByName(String beanName) 
	{
		return ApplicationContextProvider.getContext().getBean(beanName);
	}

}
