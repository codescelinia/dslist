package com.devsuperior.dslist.services;
import java.util.List;

import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.dto.GameMinDTO;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List <Game> findAll ( ) {
        gameRepository.findAll ();
       List<Game> result = gameRepository.findAll();
       return null;
    }
}
