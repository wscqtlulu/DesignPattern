package factory.abstractfactory.car;

public class TruckBenz implements Benz,Truck {
    @Override
    public void cheapRun() {
        System.out.println("奔驰货车能装货还比较便宜");
    }

    @Override
    public void loading() {
        System.out.println("奔驰货车装货");
    }
}
