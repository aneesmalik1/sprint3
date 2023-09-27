package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.repository.ItemRepo;
import com.example.service.ItemService;

@Service
public class ItemServiceimpl implements ItemService {
	
	@Autowired
	ItemRepo itemrepo;

	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemrepo.save(item);
	}
	
	@Override
	public List<Item> getAllItem(){
		return itemrepo.findAll();
	}

	@Override
	public Item updateItem(int id, Item item) {
		// TODO Auto-generated method stub
		Item i = itemrepo.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		Item i1 = itemrepo.save(i);
		return i1;
	}

	@Override
	public String deleteItem(int id) {
		itemrepo.deleteById(id);
		// TODO Auto-generated method stub
		return "DELETED THE ITEM RECORD SUCCESSFULLY";
	}

}
