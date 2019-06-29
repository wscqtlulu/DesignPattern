package factory.simplefactory.sender;

public class Test {
    public static void main(String[] args) {
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.createSender(TypeConstant.SMS);
        sender.send();
    }
}
