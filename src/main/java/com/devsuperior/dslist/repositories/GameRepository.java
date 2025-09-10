package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

/*faz consulta no banco*/
public interface GameRepository extends JpaRepository<Game, Long> {

}
