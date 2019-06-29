package factory.abstractfactory.car;

/**
 * 奔驰车工厂，只生产奔驰牌子的车，可以生产奔驰跑车也可以生产奔驰货车
 */
public class BenzFactory implements BrandCarFactory {

    @Override
    public Truck createTruck() {
        return new TruckBenz();
    }

    @Override
    public SportsCar createSportsCar() {
        return new SportsBenz();
    }
}
