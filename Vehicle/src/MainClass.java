class Vehicle {
    public void printVehicleType() {
        System.out.println("Type of Vehicles");
    }
}

class Car extends Vehicle {
    @Override
    public void printVehicleType() {
        System.out.println("Car is a four wheeler");
    }
}

class Bike extends Vehicle {
    @Override
    public void printVehicleType() {
        System.out.println("Bike is a two wheeler");
    }
}

class Auto extends Vehicle {
    @Override
    public void printVehicleType() {
        System.out.println("Auto is a three wheeler");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        Auto auto = new Auto();

        vehicle.printVehicleType();
        car.printVehicleType();
        bike.printVehicleType();
        auto.printVehicleType();
    }
}
