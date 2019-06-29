package factory.simplefactory.sender;

/**
 * @author taotao
 *
 * 简单工厂
 * 一个工厂类，生产所有产品，通过传入一个参数区分生产的产品
 */
public class SenderFactory {
    public Sender createSender(String type){
        Sender sender = null;
        switch (type){
            case TypeConstant.MAIL:
                sender = new Mail();
                break;
            case TypeConstant.SMS:
                sender = new Sms();
                break;
            default:
                break;
        }
        return sender;
    }
}
