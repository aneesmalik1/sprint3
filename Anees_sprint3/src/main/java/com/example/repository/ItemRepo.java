package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

	 
}