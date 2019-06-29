package factory.abstractfactory.car;

public class SportsBenz implements Benz,SportsCar {
    @Override
    public void cheapRun() {
        System.out.println("奔驰比较便宜");
    }

    @Override
    public void racing() {
        System.out.println("奔驰跑车也能赛车");
    }
}
