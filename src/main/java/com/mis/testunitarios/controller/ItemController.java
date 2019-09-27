package com.mis.testunitarios.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.testunitarios.model.Item;

@Controller
@RequestMapping("/rest")
public class ItemController {
	
	@GetMapping("/showitems")
	public String oneItem(int id) {
		String item = "prueba de item";
		return item;
	}
	
	@GetMapping("/checkrest")
	public ResponseEntity<Item> getItem(){
		Item item = new Item(1, "bola8", 10, 2, 0);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	

}
