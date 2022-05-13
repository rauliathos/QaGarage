package com.qa.main.day5.garage;

public abstract class Vehicle {
 
    private boolean fixVehicle;

//    Constructor
    public Vehicle(boolean fixVehicle) {
        super();
        this.fixVehicle = fixVehicle;
    }
   
    
//    methods
    public abstract int fixCost();




//    getters&setters
    public boolean isFixVehicle() {
        return fixVehicle;
    }
    
    
    public void setFixVehicle(boolean fixVehicle) {
        this.fixVehicle = fixVehicle;
    }
   
    
}
