package factory.staticfactory.sender;

/**
 * 静态工厂方法模式
 * 将new+构造函数封装到一个静态方法中，类似方法有Calendar.getInstance()
 */
public class Test {
    public static void main(String[] args) {
        Sender sender = SenderFactory.createMail();
        sender.send();
    }
}
