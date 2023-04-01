// Конкретная фабрика для такси
public class TaxiFactory implements TransportFactory {
    @Override
    public Driver createDriver() {
        return new TaxiDriver();
    }

    @Override
    public Passenger createPassenger() {
        return new TaxiPassenger();
    }

    @Override
    public Vehicle createVehicle() {
        return new Taxi();
    }
}
