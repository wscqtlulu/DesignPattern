package factory.abstractfactory.car;

public class SportsFerrari implements Ferrari,SportsCar {
    @Override
    public void runFast() {
        System.out.println("法拉利跑车跑得最快");
    }

    @Override
    public void racing() {
        System.out.println("法拉利跑车当然能赛车");
    }
}
