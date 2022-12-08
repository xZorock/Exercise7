package it.develhope.exercise7;

public abstract class Vehicle {
    private String type;
    private int numberOfWheels;

    public void showVehicleDetails() {
        System.out.println("The vehicles type is: " + type + "\n" + "Number of wheels : " + numberOfWheels );
    }
    public abstract void doVehicleSound();

    public String getType(){
        return type;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels;
    }

}
