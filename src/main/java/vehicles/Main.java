package vehicles;

import java.lang.module.ModuleReader;

public class Main {

    /*
    Time to race your vehicles! Add a main method to your package,
    or use the default main method in the base package.

    Instantiate some cars and motorcycles in your main method and try driving them.
    Run your application and see how they accelerate differently based on their attributes.
     */

    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "Yaris", 100);
        Motorcycle suzuki = new Motorcycle("Suzuki", "Ninja", false);



        suzuki.start();
        suzuki.drive();

    }
}
