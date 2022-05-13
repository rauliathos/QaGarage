package com.qa.main.day5.garage;

public class Boat extends Vehicle {

    private int numberOfEngines;
    private int capacity;
    
    public Boat(boolean fixVehicle, int numberOfEngines, int capacity) {
        super(fixVehicle);
        this.numberOfEngines = numberOfEngines;
        this.capacity = capacity;
    }

    @Override
    public int fixCost() {
        if (isFixVehicle()==true && numberOfEngines<=1&& capacity<=4) {
            return 2000;
        }else if(isFixVehicle()==true && numberOfEngines<=1&& capacity>4) {
            return 2500;
        }else if (isFixVehicle()==true && numberOfEngines>1 && capacity<=4 || capacity>4 ) {
            return 5000;
        }else {
            System.out.println("Your boat don't need to be fixed!");
        return 0;
    }}

   
    
    
    
}
