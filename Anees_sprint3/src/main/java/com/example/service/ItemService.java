package com.example.service;

import java.util.List;

import com.example.entity.Item;

public interface ItemService {
	Item createItem(Item item);
	List<Item> getAllItem();
	
	Item updateItem(int id, Item item);
	
	String deleteItem(int id);

}
