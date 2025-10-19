package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository; 
	/*não vai gerar gameMinDTO*/
//	public List<Game> findAll() {
//		List<Game> result = gameRepository.findAll();		
//		return result;
//	}
	
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//		Game result = gameRepository.findById(id).get();
//		/*GameDTO dto = new GameDTO(result);
//		return dto;*/
//		return new GameDTO(result);
//	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		/*economizar uma linha*/
//		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
}
