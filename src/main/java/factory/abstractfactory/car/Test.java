package factory.abstractfactory.car;

/**
 * @author taotao
 *
 * 抽象工厂方法
 * 符合开闭原则，每一个类配一个对应的工厂，与工厂方法类似，是工厂方法的升级
 * 针对产品组，比如车可以分类宝马，法拉利，奔驰；也可以分类轿车，跑车，货车；工厂方法则是这6类都有一个工厂，抽象工厂则是可以根据品牌分成3个工厂（宝马工厂、法拉利工厂、奔驰工厂，这3个工厂都可以生产对应品牌的轿车、跑车、货车），也可以根据车的型号分成另外3个工厂（轿车工厂、跑车工厂、货车工厂）
 */
public class Test {
    public static void main(String[] args) {
        BrandCarFactory benzFactory = new BenzFactory();
        Truck truckBenz = benzFactory.createTruck();
        SportsCar sportsBenz = benzFactory.createSportsCar();

        BrandCarFactory ferrariFactory = new FerrariFactory();

    }
}
