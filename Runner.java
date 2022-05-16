package com.qa.main.day5;

import com.qa.main.day5.garage.Car;
import com.qa.main.day5.garage.Garage;

public class Runner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car teslaCar1 = new Car(true, 4, true, "sport");
        Car teslaCar2 = new Car(false, 4, true, "sport");
        Car car1 = new Car(true, 2, false, "normal");
        Car car2 = new Car(false, 4, false, "sport");
        Car car3 = new Car(true, 2, false, "normal");
        
        System.out.println(teslaCar1.fixCost());
        System.out.println(teslaCar2.fixCost());
        System.out.println(car1.fixCost());
    
    Garage serviceGarage = new Garage();
    
    System.out.println(serviceGarage.addVehicle(teslaCar1));
    System.out.println(serviceGarage.removeVehicle(teslaCar2));
    serviceGarage.addVehicle(teslaCar2);
    serviceGarage.addVehicle(car3);
    serviceGarage.addVehicle(car2);
    serviceGarage.addVehicle(car1);
    serviceGarage.addVehicle(teslaCar1);
    System.out.println(serviceGarage.carsInGarage());

    System.out.println(serviceGarage.getVehicle(0));
    System.out.println(serviceGarage.fixVehicle(5));
    System.out.println(serviceGarage.fixVehicle(4));
    System.out.println(serviceGarage.fixVehicle(3));
    System.out.println(serviceGarage.fixVehicle(2));
    System.out.println(serviceGarage.fixVehicle(1));
    System.out.println(serviceGarage.fixVehicle(0));
    
    System.out.println(serviceGarage.carsInGarage());
    }
    
    
    
    

}
