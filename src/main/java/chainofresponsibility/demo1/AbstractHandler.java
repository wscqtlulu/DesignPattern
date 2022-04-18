package chainofresponsibility.demo1;

public class AbstractHandler {
    Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
