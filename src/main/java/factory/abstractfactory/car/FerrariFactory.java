package factory.abstractfactory.car;

public class FerrariFactory implements BrandCarFactory {
    @Override
    public Truck createTruck() {
        return new TruckFerrari();
    }

    @Override
    public SportsCar createSportsCar() {
        return new SportsFerrari();
    }
}
