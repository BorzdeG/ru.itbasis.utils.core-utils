package ru.itbasis.utils.core.model.tree;

import ru.itbasis.utils.core.model.IParent;

import java.util.ArrayList;
import java.util.List;

public interface ITreeParents<Self, Category extends ITreeCategory> extends IParent<Self, Category> {
	@SuppressWarnings("unchecked")
	default List<Category> getAllParents() {
		// FIXME Реализовать вычисляемое поле в БД
		final List<Category> list = new ArrayList<>();
		Category pCategory = getParent();
		while (pCategory != null) {
			list.add(pCategory);
			pCategory = (Category) pCategory.getParent();
		}
		return list;
	}

}
