package vehicles;

abstract class Vehicle {

    String make;

    String model;

    int speed;

    Engine engine;

    public void start() {
        engine.start();
    }

    public void drive() {
        if(this.engine.running) {
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    protected abstract void accelerate();

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
