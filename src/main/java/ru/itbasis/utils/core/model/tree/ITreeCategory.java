package ru.itbasis.utils.core.model.tree;

import ru.itbasis.utils.core.ISelf;
import ru.itbasis.utils.core.model.IDescription;
import ru.itbasis.utils.core.model.IId;
import ru.itbasis.utils.core.model.IParent;
import ru.itbasis.utils.core.model.ITitle;

import java.util.List;

public interface ITreeCategory<Category extends ITreeCategory, Item extends ITreeItem>
	extends IId, ITitle<Category>, IParent<Category, Category>, IDescription<ITreeCategory>, ISelf<Category> {

	List<Item> getItems();

	Category setItems(List<Item> list);

	List<Category> getCategories();

	Category setCategories(List<Category> list);

}
