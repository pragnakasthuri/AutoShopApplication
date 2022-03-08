package com.bridgelabz;

/**
 * Creating MyOwnAutoShop containing main method
 */

public class MyOwnAutoShop {
    /**
     * Main method for modifying the values and getting the results
     * @param args - default java param
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE:
         * 1.Creating object for Sedan, Ford, Truck and Car and initializing
         *   all the fields with appropriate values
         * 2.Printing the sale price for Sedan, Ford1, Ford2, Car and Truck
         */

        /**
         * 1.Creating object for Sedan, Ford, Truck and Car and initializing
         * all the fields with appropriate values
         */
        Sedan sedan = new Sedan(22, 160, 50000, "White");

        Ford ford1 = new Ford(2010, 10000,160, 60000.00, "Red");
        Ford ford2 = new Ford(2012, 5000, 180, 70000.00, "Blue");

        Car car = new Car(120, 50000,  "Black");

        Truck truck = new Truck(3000, 130, 70000, "Yellow");

        /**
         * 2.Printing the sale price for Sedan, Ford1, Ford2, Car and Truck
         */
        System.out.println("Sedan sale price: "+sedan.getSalePrice());
        System.out.println("Ford1 sale price: "+ford1.getSalePrice());
        System.out.println("Ford2 sale price: "+ford2.getSalePrice());
        System.out.println("Car sale price: " +car.getSalePrice());
        System.out.println("Truck sale price: " +truck.getSalePrice());
    }
}



