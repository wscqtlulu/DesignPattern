package factory.factorymethod.sender;

public class Mail implements Sender {
    @Override
    public void send(){
        System.out.println("mail send");
    }
}
