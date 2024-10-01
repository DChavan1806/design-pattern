package design.pattern.creational.factory.methode;

// Step 1: Create a common interface for transport types //product
interface Transport {
    void deliver();
}

// Step 2: Create concrete implementations of the transport types
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}

// Step 3: Create an abstract class with the factory method
abstract class Logistics {
    public abstract Transport createTransport();
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

// Step 4: Create concrete factories for Truck and Ship
class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

// Step 5: Client code
public class FactoryMethodExample {
    public static void main(String[] args) {

        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}

