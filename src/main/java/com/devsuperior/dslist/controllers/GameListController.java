package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	public GameListService gameListService;

//	@GetMapping(value = "/{id}")
//	public GameDTO findById(@PathVariable Long id) {
//		GameDTO result = gameService.findById(id);
//		return result;
//	}
	
	@GetMapping
	/*não vai gerar gameMinDTO como foi feito em Service*/
//	public List<Game> findAll() {
//		List<Game> result = gameService.findAll();
//		return result;
//	}
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
