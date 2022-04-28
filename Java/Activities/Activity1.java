package activities;

public class Activity1 {

    public static void main(String[] args) {
    Car alto = new Car();
    alto.make = 2014;
    alto.color = "black";
    alto.transmission ="Manual";

    alto.displayCharacteristics();
    alto.accelerate();
    alto.brake();
    }
}
