package com.bm.house;

public class FlatHouseBuilder implements HouseBuilder {

    private HousePlan house;

    public FlatHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder roof(String roof) {
        house.setRoof(roof);
        return this;
    }

    @Override
    public HouseBuilder iterior(String interior) {
        house.setIterior(interior);
        return this;
    }

    @Override
    public HouseBuilder hall(String hall) {
        house.setHall(hall);
        return this;
    }

    public HousePlan build(){
        return this.house;
    }
}
