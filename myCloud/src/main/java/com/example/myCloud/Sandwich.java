package com.example.myCloud;

import lombok.Data;

import java.util.List;

@Data
public class Sandwich {

    private String name;
    private List<Ingredient> ingredients;

}
