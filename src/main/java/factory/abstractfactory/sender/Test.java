package factory.abstractfactory.sender;

/**
 * 抽象工厂方法
 * 符合开闭原则，每一个类配一个对应的工厂，与工厂方法类似，是工厂方法的升级
 */
public class Test {
    public static void main(String[] args) {
        MailFactory mailFactory = new MailFactory();
        Sender mailSender = mailFactory.createSender();
        mailSender.send();

        SmsFactory smsFactory = new SmsFactory();
        Sender smsSender = smsFactory.createSender();
        smsSender.send();
    }
}
