package factory.factorymethod.sender;

public class MailFactory implements Factory {

    @Override
    public Sender createSender() {
        return new Mail();
    }
}
