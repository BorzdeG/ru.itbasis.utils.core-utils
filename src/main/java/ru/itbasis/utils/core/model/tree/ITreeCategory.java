package ru.itbasis.utils.core.model.tree;

import ru.itbasis.utils.core.ISelf;
import ru.itbasis.utils.core.model.IDescription;
import ru.itbasis.utils.core.model.IId;
import ru.itbasis.utils.core.model.ITitle;

public interface ITreeCategory<Category extends ITreeCategory, Item extends ITreeItem>
	extends IId, ITitle<Category>, ITreeParents<Category, Category>, ITreeChildCategories<Category, Category>, ITreeChildItems<Category, Item>,
	        IDescription<ITreeCategory>, ISelf<Category> {
}
