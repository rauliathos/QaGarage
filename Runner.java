package com.qa.main.day5;

import com.qa.main.day5.garage.Car;

public class Runner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car teslaCar1 = new Car(true, 4, true, "sport");
        Car teslaCar2 = new Car(false, 4, true, "sport");
        
        System.out.println(teslaCar1.fixCost());
        System.out.println(teslaCar2.fixCost());
    }

}
