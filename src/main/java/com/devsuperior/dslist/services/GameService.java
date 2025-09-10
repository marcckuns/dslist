package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; 
	/*não vai gerar gameMinDTO*/
//	public List<Game> findAll() {
//		List<Game> result = gameRepository.findAll();		
//		return result;
//	}
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		/*economizar uma linha*/
//		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
