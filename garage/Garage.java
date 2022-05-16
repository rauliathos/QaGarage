package com.qa.main.day5.garage;

import java.util.ArrayList;

public class Garage {
    public ArrayList<Vehicle> garage = new ArrayList<>();

    public String addVehicle(Vehicle newVehicle) {
        garage.add(newVehicle);
        return newVehicle + " to be fixed";
    }

    public String removeVehicle(Vehicle newVehicle) {
        garage.remove(newVehicle);
        return newVehicle + " was removed from the garage";

    }

    public String getVehicle(int x) {
        garage.get(x);
        return "here we go!!";
    }

    public String fixVehicle(int x) {
        System.out.println("*****-----*****-----*****");
        String fixed = garage.get(x).fixCost() + " is the cost ";
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        garage.remove(x);
        
        return fixed;
    }

    public int carsInGarage() {
        return garage.size();
    }
}