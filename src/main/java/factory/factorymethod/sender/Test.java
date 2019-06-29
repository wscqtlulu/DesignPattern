package factory.factorymethod.sender;

/**
 * 工厂方法模式
 * 符合开闭原则，每一个类配一个对应的工厂
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
