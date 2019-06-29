package mediator;

public class User1 extends User {

    User1(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void work() {
        System.out.println("user1 work");
    }
}
