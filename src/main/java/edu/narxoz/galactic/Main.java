package edu.narxoz.galactic;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.LightDrone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Galactic Drone Dispatcher!");
        Drone l1 = new LightDrone("LD-001", 5.0);
        System.out.print(l1.getId() + " speed: " + l1.speedKmPerMin() + " km/min");
    }
}