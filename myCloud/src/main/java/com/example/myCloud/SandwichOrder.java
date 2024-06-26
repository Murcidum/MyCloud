package com.example.myCloud;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SandwichOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Sandwich> sandwiches = new ArrayList<>();

    public void addSandwich(Sandwich sandwich){
        this.sandwiches.add(sandwich);
    }
}
