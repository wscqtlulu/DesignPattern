package factory.abstractfactory.car;

public class TruckFerrari implements Ferrari,Truck {
    @Override
    public void runFast() {
        System.out.println("法拉利货车装货跑也快");
    }

    @Override
    public void loading() {
        System.out.println("法拉利货车装货");
    }
}
