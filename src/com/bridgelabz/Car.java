package com.bridgelabz;

/**
 * Creating a super class called Car. The Car class has speed, regularPrice and color
 */

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    /**
     * Creating parameterized constructor for Car
     */
    public Car(int speed, double regularPrice, String color) {
        super();
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /**
     * Creating getter and setter methods for all the instance variables of the class
     */
    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public double getRegularPrice() { return regularPrice; }

    public void setRegularPrice(double regularPrice) { this.regularPrice = regularPrice; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    /**
     * Creating the getSalePrice for calculating the sale price for car
     * @return the regular price for Car
     */
    public double getSalePrice() {
        return regularPrice;
    }
}

/**
 * Creating Truck class which extends from Car class
 */
class Truck extends Car {
    private int weight;

    /**
     * Creating parameterized constructor for Truck
     */
    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    /**
     * Calculates the salePrice for weight>2000,10%discount. Otherwise, 20% discount.
     * @return the sale price for Truck
     */
    public double getSalePrice() {
        if(this.weight > 2000){
            return this.getRegularPrice() - (10*this.getRegularPrice())/100;
        }
        else {
            return this.getRegularPrice() - (20*this.getRegularPrice())/100;
        }
    }
}

/**
 * Creating Ford class which extends from Car class
 */
class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    /**
     * Creating parameterized constructor for Ford
     */
    public Ford(int year, int manufacturerDiscount, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    /**
     * Sale price computed from Car class and subtract
     * the manufacturer Discount.
     * @return the sale price for Ford
     */
    public double getSalePrice() {
        return this.getRegularPrice() - this.manufacturerDiscount;
    }
}

/**
 * Creating Sedan class which extends from Car class
 */
class Sedan extends  Car {
    private int length;

    Sedan(int length, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    /**
     * Calculates the salePrice for length>20 feet, 5% discount, Otherwise, 10% discount.
     * @return the sale price for Sedan
     */
    public double getSalePrice() {
        if (length > 20) {
            return this.getRegularPrice() - (5 * this.getRegularPrice()) / 100;
        } else {
            return this.getRegularPrice() - (10 * this.getRegularPrice()) / 100;
        }
    }
}


