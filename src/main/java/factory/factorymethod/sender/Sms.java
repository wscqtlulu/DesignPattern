package factory.factorymethod.sender;

public class Sms implements Sender {
    @Override
    public void send(){
        System.out.println("sms send");
    }
}
