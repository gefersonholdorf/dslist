package com.gefersonholdorf.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gefersonholdorf.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
