
// Interface with abstract, default, and static method
interface RemoteControl {
    void turnOn(); // Abstract method

    default void batteryStatus() {
        System.out.println("Battery Status 30");
    }

    static void info() {
        System.out.println("RemoteControl");
    }
}

// Implementation class for RemoteControl
class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
}

// First interface
interface Printable {
    void print();
}

// Second interface
interface Scannable {
    void scan();
}

// Class implementing multiple interfaces
class MultifunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }
}

// Main class
public class Task1 {
    public static void main(String[] args) {
        // Task 1: Abstract + Default Method
        TV tv = new TV();
        tv.turnOn();
        tv.batteryStatus();

        // Task 2: Static method in interface
        RemoteControl.info();

        // Task 3: Multiple interfaces
        MultifunctionPrinter obj = new MultifunctionPrinter();
        obj.print();
        obj.scan();
    }
}
