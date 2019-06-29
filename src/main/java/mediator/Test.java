package mediator;

/**
 * @author taotao
 *
 * 中介者模式
 */
public class Test {
    public static void main(String[] args) {
        MyMediator myMediator =  new MyMediator();
        myMediator.createUsers();
        myMediator.workAll();
    }
}
