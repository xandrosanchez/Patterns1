// Абстрактная фабрика для создания транспортных средств
public interface TransportFactory {
    Driver createDriver();

    Passenger createPassenger();

    Vehicle createVehicle();
}
