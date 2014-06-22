package ru.itbasis.utils.core.model.tree;

import java.util.List;

public interface ITreeParents<Category> {
	List<Category> getParents();

	void setParents(List<Category> parents);
}
