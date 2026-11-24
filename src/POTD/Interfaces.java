package POTD;

/**
 * TO BE COMPLETED BY STUDENT:
 * * Your task is to complete the HoverCar class below by implementing all
 * the required methods from the Flyable and Drivable interfaces.
 */

// --- Interface 1: Flyable ---
interface Flyable {
    /**
     * Abstract method: Implement this method to handle the vehicle ascending.
     */
    void takeOff();

    /**
     * Default method (Java 8+): Provides a default implementation.
     * You should OVERRIDE this method in HoverCar to provide a custom landing sequence.
     */
    default void descend() {
        System.out.println("-> Default Flyable: Safely gliding down.");
    }
}

// --- Interface 2: Drivable ---
interface Drivable {
    /**
     * Abstract method: Implement this method to turn on the vehicle's power source.
     */
    void startEngine();

    /**
     * Abstract method: Implement this method to handle the vehicle turning.
     */
    void turn(String direction);
}

// --- Concrete Class: HoverCar ---
// You must provide implementations for all three abstract methods (takeOff, startEngine, turn)
// AND override the default method (descend).
class HoverCar implements Flyable, Drivable {

    // HINT: You may want to use a private state variable to track if the engine is running.
    private boolean isEngineOn = false;

    // 1. IMPLEMENTATION REQUIRED for Flyable.takeOff()
    @Override
    public void takeOff() {
        // [YOUR CODE HERE]
        // Example logic: Check if the engine is on before taking off.
    }

    // 2. OVERRIDE REQUIRED for Flyable.descend()
    @Override
    public void descend() {
        // [YOUR CODE HERE]
        // Example logic: Print a custom landing message.
    }

    // 3. IMPLEMENTATION REQUIRED for Drivable.startEngine()
    @Override
    public void startEngine() {
        // [YOUR CODE HERE]
        // Example logic: Set the engine state to true and print a status message.
    }

    // 4. IMPLEMENTATION REQUIRED for Drivable.turn(String direction)
    @Override
    public void turn(String direction) {
        // [YOUR CODE HERE]
        // Example logic: Check if the engine is on, then print the direction.
    }
}

// --- Main Demonstration Class (Do Not Modify) ---
public class Interfaces {
    public static void main(String[] args) {
        System.out.println("--- HoverCar Demonstration ---");

        HoverCar myVehicle = new HoverCar();

        System.out.println("\n--- Starting Sequence ---");
        myVehicle.startEngine();
        myVehicle.turn("left");

        System.out.println("\n--- Flight Test ---");
        myVehicle.takeOff();
        myVehicle.descend();

        System.out.println("\n--- Ground Maneuver ---");
        myVehicle.startEngine(); // Already on
        myVehicle.turn("right");

        System.out.println("\n--- Test Failed Takeoff (Should show error message) ---");
        // Simulate engine being off for this test (Advanced: Requires reflection or a separate test object)
        // For simplicity, the student should ensure takeOff() logic handles the 'engine off' state correctly.

        // Polymorphism check (Does not require student change, just verification)
        System.out.println("\n--- Polymorphism Check ---");
        Flyable flyer = myVehicle;
        flyer.takeOff();
    }
}
