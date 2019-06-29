package decorator.example2;

/**
 * @author taotao
 */
public class Test {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        HeadDecorator headDecorator = new HeadDecorator(zhangSan);
        headDecorator.goOut();

        LiSi liSi = new LiSi();
        FootDecorator footDecorator = new FootDecorator(liSi);
        footDecorator.goOut();

        footDecorator.person = zhangSan;
        footDecorator.goOut();

//        FootDecorator footDecorator1 = new FootDecorator(zhangSan);
//        footDecorator1.goOut();
    }
}
