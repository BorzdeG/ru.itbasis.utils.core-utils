package ru.itbasis.utils.core.model.tree;

import ru.itbasis.utils.core.model.IDescription;
import ru.itbasis.utils.core.model.IId;
import ru.itbasis.utils.core.model.ITitle;

public interface ITreeItem<Category extends ITreeCategory, Item extends ITreeItem>
	extends IId, ITreeParents<Item, Category>, ITitle, IDescription<Item> {
}
