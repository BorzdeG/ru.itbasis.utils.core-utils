package ru.itbasis.utils.core.model;

public interface IId<Self> {
	String FLD_ID = "id";

	Long getId();

	Self setId(final Long id);
}
