// Конкретная фабрика для автобусов
public class BusFactory implements TransportFactory {
    @Override
    public Driver createDriver() {
        return new BusDriver();
    }

    @Override
    public Passenger createPassenger() {
        return new BusPassenger();
    }

    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
