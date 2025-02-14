package com.bm.house;

public interface HouseBuilder {

    HouseBuilder roof(String roof);

    HouseBuilder iterior(String interior);

    HouseBuilder hall(String hall);

    HousePlan build();
}
