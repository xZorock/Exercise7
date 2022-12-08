package it.develhope.exercise7;

public class Boat extends Vehicle {
    private double maxKnotSpeed;
    private int boatKilosWeight;

    public Boat(double maxSpeed,int weight){
    this.setType("Boat");
    this.maxKnotSpeed=maxSpeed;
    this.boatKilosWeight=weight;
    }

    public String getBoatWeightAndSpeed(){
        return "Total kilos weight : " + boatKilosWeight + " - " + "Maximusm knots speed : " + maxKnotSpeed;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("The sound of this boat is 'WRUUUUUUUM'");
    }
}
