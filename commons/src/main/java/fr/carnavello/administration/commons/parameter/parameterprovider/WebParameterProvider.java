package fr.carnavello.administration.commons.parameter.parameterprovider;

import javax.servlet.ServletContext;

import fr.carnavello.administration.commons.servlet.ServletContextProvider;

public class WebParameterProvider implements ReadableParameterProvider{

	public WebParameterProvider() {
	}
	

	
	@Override
	public String getParameter(String input) 
	{
		ServletContext context = ServletContextProvider.getContext();
		String initParameter = context.getInitParameter(input);
		return initParameter;
	}

}
