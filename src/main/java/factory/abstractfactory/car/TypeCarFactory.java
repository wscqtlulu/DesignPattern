package factory.abstractfactory.car;

/**
 * @author taotao
 *
 * 车型号工厂，能生产各种品牌的车，但是只能生产一种型号的车，比如只能生产跑车，或者只能生产货车
 */
public interface TypeCarFactory {
    Ferrari createFerrari();

    Benz createBenz();
}
