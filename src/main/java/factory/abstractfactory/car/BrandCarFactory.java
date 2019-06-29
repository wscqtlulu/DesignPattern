package factory.abstractfactory.car;

/**
 * @author taotao
 *
 * 汽车牌子工厂，只生产一种牌子的汽车，但是可以生产这种牌子所有型号的汽车
 */
public interface BrandCarFactory {

    Truck createTruck();

    SportsCar createSportsCar();
}
