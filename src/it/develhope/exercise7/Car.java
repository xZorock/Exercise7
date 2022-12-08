package it.develhope.exercise7;

public class Car extends Vehicle{

    private int numberOfDoors;
    private double carPrice;

    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        this.setType("Car");
        this.setNumberOfWheels(numberOfWheels);
        this.numberOfDoors=numberOfDoors;
        this.carPrice=carPrice;

    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The car has " + numberOfDoors + " doors");
    }
    @Override
    public void doVehicleSound() {
        System.out.println("The sound of this car is  'BRUUUUUM' ");
    }
}
