package factory.abstractfactory.car;

public class TruckFactory implements TypeCarFactory {
    @Override
    public Ferrari createFerrari() {
        return new TruckFerrari();
    }

    @Override
    public Benz createBenz() {
        return new TruckBenz();
    }
}
