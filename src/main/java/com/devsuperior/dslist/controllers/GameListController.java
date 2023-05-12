package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gamelistservice;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result =  gamelistservice.findAll();
		return result;
		
	}
	
	@GetMapping(value="/{id}")
	public GameListDTO findById(@PathVariable Long id) {
		GameListDTO result = gamelistservice.findById(id);	
		return result;
	}
}
