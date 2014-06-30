package ru.itbasis.utils.core.service;

import ru.itbasis.utils.core.model.tree.ITreeCategory;
import ru.itbasis.utils.core.model.tree.ITreeItem;

import java.util.List;

public interface ITreeService<Category extends ITreeCategory, Item extends ITreeItem, Filter> {
	List<Category> getRootCategoryAll();

	List<Category> getRootCategoryAll(final Filter filter);

	List<Category> getChildrenCategoryAll(final Category parent);

	List<Category> getChildrenCategoryAll(final Category parent, final Filter filter);

	Category getCategory(final long id);

	Item getItem(final long id);

}
