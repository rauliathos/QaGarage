package com.qa.main.day5.garage;

public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean electric;
    private String model;

    public Car(boolean fixVehicle, int numberOfDoors, boolean electric, String model) {
        super(fixVehicle);
        this.numberOfDoors = numberOfDoors;
        this.electric = electric;
        this.model = model;
    }

    @Override
    public int fixCost() {
        if (isFixVehicle() == true && electric == true) {
            return 1000;
        } else if (numberOfDoors <= 2 && model == "sport") {
            return 800;
        } else if (model == "normal") {
            return 400;
        } else {
            System.out.println("Your car is OK.");
            return 0;
        }
    }

}
