package factory.staticfactory.sender;

public class SenderFactory {

    public static Sender createMail(){
        return new Mail();
    }

    public static Sender createSms(){
        return new Sms();
    }
}
