package ru.itbasis.utils.core.model;

public interface IParent<Self, Parent> {
	public static final String FLD_PARENT = "parent";

	Parent getParent();

	Self setParent(Parent value);

}
