package com.qa.main.day5.garage;

public class Bike extends Vehicle {

    
   private boolean isElectric;

public Bike(boolean fixVehicle, boolean isElectric) {
    super(fixVehicle);
    this.isElectric = isElectric;
}

@Override
public int fixCost() {
    // TODO Auto-generated method stub
    return 0;
}


   
}
