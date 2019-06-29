package mediator;

public class User2 extends User {

    User2(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void work() {
        System.out.println("user2 work");
    }
}
