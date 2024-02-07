package com.br.campeonatobrasileiro.controller;

import com.br.campeonatobrasileiro.model.Clube;
import com.br.campeonatobrasileiro.repository.ClubeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ClubeController {
    @Autowired
    private ClubeRespository action;

    @PostMapping("/")
    public Clube register(@RequestBody Clube c){
        return action.save(c);
    }

    @GetMapping("/")
    public Iterable<Clube> getClubes() {
        return action.findAll();
    }

    @PutMapping("/")
    public Clube edit(@RequestBody Clube c) {
        return action.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        action.deleteById(id);
    }
}
