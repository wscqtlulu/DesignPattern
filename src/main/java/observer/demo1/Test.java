package observer.demo1;

/**
 * @author taotao
 *
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        MyBoss boss = new MyBoss();
        LaoWang laoWang = new LaoWang();
        LaoLi laoLi = new LaoLi();
        boss.addObserver(laoWang);
        boss.addObserver(laoLi);
        boss.call();
        System.out.println("老王离职");
        boss.removeObserver(laoWang);
        boss.call();
    }
}
