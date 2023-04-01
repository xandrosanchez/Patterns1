public class AbstractFactory {
    public static void main(String[] args) {
        // Создание фабрики для автобусов
        TransportFactory busFactory = new BusFactory();

// Создание водителя автобуса
        Driver busDriver = busFactory.createDriver();

// Создание пассажира автобуса
        Passenger busPassenger = busFactory.createPassenger();

// Создание автобуса
        Vehicle bus = busFactory.createVehicle();

// Добавление водителя и пассажира в автобус
        bus.addDriver(busDriver);
        bus.addPassenger(busPassenger);
    }
}

