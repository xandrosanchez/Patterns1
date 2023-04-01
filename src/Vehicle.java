import java.util.ArrayList;
import java.util.List;

// Абстрактный класс транспортного средства
public abstract class Vehicle {
    protected int maxPassengers;
    protected List<Driver> drivers = new ArrayList<>();
    protected List<Passenger> passengers = new ArrayList<>();

    public void addDriver(Driver driver) {
        if (drivers.size() < 2) {
            drivers.add(driver);
        } else {
            throw new RuntimeException("Cannot add more than 2 drivers to a vehicle");
        }
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            throw new RuntimeException("Vehicle is full");
        }
    }

    public boolean isReadyToGo() {
        return drivers.size() > 0 && passengers.size() > 0;
    }
}
