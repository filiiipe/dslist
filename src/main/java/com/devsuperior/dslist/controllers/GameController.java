package com.devsuperior.dslist.controllers;


import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
       GameDTO result = gameService.findById(id);
       return result;
    }

    public List<GameMinDTO> findAll(){
       List<GameMinDTO> result = gameService.findAll();
       return result;
    }




}
