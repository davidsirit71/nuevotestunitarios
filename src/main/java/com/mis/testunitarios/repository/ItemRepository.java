package com.mis.testunitarios.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mis.testunitarios.model.Item;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Serializable>{
	
	public abstract Item findByName(String name);

}
