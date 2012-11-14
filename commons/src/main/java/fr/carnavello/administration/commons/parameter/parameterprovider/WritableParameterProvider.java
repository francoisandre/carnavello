package fr.carnavello.administration.commons.parameter.parameterprovider;

public interface WritableParameterProvider extends ReadableParameterProvider
{
	public void setParameter(String key,String value);
}
