package ru.itbasis.utils.core.model;

public interface ITitle<Self> {
	String FLD_TITLE = "title";

	String getTitle();

	Self setTitle(final String title);
}
