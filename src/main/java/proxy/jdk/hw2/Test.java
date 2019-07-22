package proxy.jdk.hw2;

public class Test {
    public static void main(String[] args) {
        Person taoTao = (Person) new Intermediary().getNewInstance(new TaoTao());
        taoTao.findHome();
    }
}
