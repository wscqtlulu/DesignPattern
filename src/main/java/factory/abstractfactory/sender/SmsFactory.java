package factory.abstractfactory.sender;

public class SmsFactory implements Factory {

    @Override
    public Sender createSender() {
        return new Sms();
    }
}
