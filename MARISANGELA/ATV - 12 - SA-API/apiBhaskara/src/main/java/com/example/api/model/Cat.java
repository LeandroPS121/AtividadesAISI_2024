package com.example.api.model;

import lombok.Getter;
import lombok.Setter;

public class Cat {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String breed;

    
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
}
