package ru.itbasis.utils.core.service;

import ru.itbasis.utils.core.model.tree.ITreeCategory;
import ru.itbasis.utils.core.model.tree.ITreeItem;

import java.util.List;

public interface ITreeService<Category extends ITreeCategory, Item extends ITreeItem, Filter> {
	List<Category> getRootCategoryAll();

	List<Category> getRootCategoryAll(Filter filter);

	List<Category> getChildrenCategoryAll(Category parent);

	List<Category> getChildrenCategoryAll(Category parent, Filter filter);

	Category getCategory(long id);

	Item getItem(long id);

}
