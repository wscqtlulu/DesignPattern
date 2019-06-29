package factory.abstractfactory.car;

public class SportsCarFactory implements TypeCarFactory {
    @Override
    public Ferrari createFerrari() {
        return new SportsFerrari();
    }

    @Override
    public Benz createBenz() {
        return new SportsBenz();
    }
}
