package com.bm.house;

public class House implements HousePlan {

    private String roof;
    private String interior;
    public  String hall;

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setIterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void setHall(String hall) {
        this.hall = hall;
    }
}
