package com.qa.main.day5.garage;

public class Bike extends Vehicle {

    
   private boolean isElectric;

public Bike(boolean fixVehicle, boolean isElectric) {
    super(fixVehicle);
    this.isElectric = isElectric;
}

@Override
public int fixCost() {
    if (isFixVehicle()==true && isElectric==true) {
        return 150;
    }else if(isFixVehicle()==true && isElectric==false) {
        return 50;
    }else {
    return 0;
}}


   
}
