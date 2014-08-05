package ru.itbasis.utils.core.model;

public interface IParent<Self, Parent> {
	String FLD_PARENT = "parent";

	Parent getParent();

	Self setParent(final Parent value);
}
