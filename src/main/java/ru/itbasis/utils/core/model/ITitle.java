package ru.itbasis.utils.core.model;

public interface ITitle<Self> {
	public static final String FLD_TITLE = "title";

	String getTitle();

	Self setTitle(final String title);
}
