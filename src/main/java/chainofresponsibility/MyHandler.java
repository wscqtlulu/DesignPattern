package chainofresponsibility;

public class MyHandler extends AbstractHandler implements Handler {
    String handlerName;

    MyHandler(String handlerName){
        this.handlerName = handlerName;
    }

    @Override
    public void operate() {
        Handler handler = getHandler();
        System.out.println(handlerName + " deal");
        if (handler != null){
            handler.operate();
        }

    }
}
