package ru.itbasis.utils.core;

public interface ISelf<T> {

	@SuppressWarnings("unchecked")
	// CHECKSTYLE:OFF
	default T getSelf() {
		return (T) this;
	}
	// CHECKSTYLE:ON

}
