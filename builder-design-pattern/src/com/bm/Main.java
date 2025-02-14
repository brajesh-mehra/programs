package com.bm;

import com.bm.house.FlatHouseBuilder;
import com.bm.house.HouseBuilder;
import com.bm.house.HousePlan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HousePlan house = new FlatHouseBuilder()
        .hall("Paint it with Blue color")
        .iterior("wooden work")
        .roof("Concrete")
                .build();

        System.out.println(house.toString());

    }
}
