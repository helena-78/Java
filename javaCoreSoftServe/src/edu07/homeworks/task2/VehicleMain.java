package edu07.homeworks.task2;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Liner(1500, 5),
                new Boat(4, 10),
                new Plane(200, 5000),
                new Helicopter(5, 1089, 6),
                new Bus(45, "Bonerowska"),
                new Car(2, "model s"),
                new Motorcycle(1, 350)};

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof WaterVehicle) {
                System.out.println("Vehicle belongs to water type");
                ((WaterVehicle) vehicle).isSailing();
            } else if (vehicle instanceof FlyingVehicle) {
                System.out.println("Vehicle belongs to flying type");
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            } else {
                System.out.println("Vehicle belongs to ground type");
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}
