package com.gefersonholdorf.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gefersonholdorf.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
