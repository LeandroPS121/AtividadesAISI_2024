package com.example.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Cat;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/cats")
public class CatController {
    private List<Cat> cats = new ArrayList<>();

    public CatController(){
        cats.add(new Cat("gato","rotvale"));
    }

    @GetMapping
    public ResponseEntity <List<Cat>> getAllCats(){
        if(cats.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Cat> getCat(@PathVariable String name) {
        Optional<Cat> cat = cats.stream().filter(c -> c.getName().equals(name)).findFirst();
        if (cat.isPresent()){
            return new ResponseEntity<>(cat.get(), HttpStatus.OK);
        }    
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    
    }

    @PostMapping
    public ResponseEntity<String> createCat(@RequestBody Cat cat) {
        cats.add(cat);
        return new ResponseEntity<>("Created!",HttpStatus.CREATED);
    }
}
