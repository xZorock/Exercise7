package it.develhope.exercise7;

public class Start {
    public static void main(String[] args) {

        Car car = new Car(4,5,1.500);
        Boat boat = new Boat(80,1000);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("-----------");

        boat.showVehicleDetails();
        boat.doVehicleSound();

        String boat1 = boat.getBoatWeightAndSpeed();
        System.out.println(boat1);
    }
}
