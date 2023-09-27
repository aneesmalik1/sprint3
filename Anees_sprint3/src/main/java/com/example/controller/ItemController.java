package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Item;
import com.example.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	
	@PostMapping("/postitem")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	@GetMapping("/getAllItem")
	List<Item> getAllItem(){
		return itemService.getAllItem();	
	}
	
	@PutMapping("/updateItem/{id}")
	Item updateItem(@PathVariable int id, @RequestBody Item i) {
		
		return itemService.updateItem(id, i) ;
	}
	
	@DeleteMapping("/deleteItem/{id}")
	String deleteItem(@PathVariable int id) {
		return itemService.deleteItem(id) ;
		
	}

}
