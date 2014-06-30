package ru.itbasis.utils.core;

public interface ISelf<T> {

	@SuppressWarnings("unchecked")
	default T getSelf() {
		return (T) this;
	}

}
