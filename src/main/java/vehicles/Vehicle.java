package vehicles;

abstract class Vehicle {

    String make;
    String model;
    int speed;
    Engine engine;

    public Vehicle(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

     public void start() {
        engine.start();
    }

    protected abstract void accelerate();

    public void drive() {
        if(engine.running) {
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }


}
