package ru.itbasis.utils.core.model.tree;

import java.util.List;

public interface ITreeChildItems<Self, Item> {
	List<Item> getChildItems();

	Self setChildItems(final List<Item> list);
}
