package ru.itbasis.utils.core.model.tree;

import java.util.List;

public interface ITreeChildCategories<Self, Category> {
	List<Category> getChildCategories();

	Self setChildCategories(final List<Category> list);
}
