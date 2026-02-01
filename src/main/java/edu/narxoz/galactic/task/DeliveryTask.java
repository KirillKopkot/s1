package edu.narxoz.galactic.task;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.Drone;
public class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;
    private TaskState state;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.destination = destination;
        this.origin = origin;
        this.cargo = cargo;
        this.state = TaskState.CREATED;
        this.assignedDrone = null;
    }

    public CelestialBody getOrigin() {
        return origin;
    }

    public CelestialBody getDestination() {
        return destination;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public TaskState getState() {
        return state;
    }

    public Drone getAssignedDrone() {
        return assignedDrone;
    }

    public double estimateTime(Drone drone) {
        if (drone == null) {
            throw new IllegalArgumentException("Drone cannot be null");
        }

        if (assignedDrone.speedKmPerMin() <= 0) {
            throw new IllegalArgumentException("Drone speed must be positive");
        }

        double distance = origin.distanceTo(destination);
        return distance / drone.speedKmPerMin();
    }

    private void setState(TaskState state) {
        this.state = state;
    }

    public void setAssignedDrone(Drone drone) {
        this.assignedDrone = drone;
        this.state = TaskState.ASSIGNED;
    }
}