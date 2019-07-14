package delegate;

public class Leader implements Work {

    private Work person;

    Leader(Work person){
        this.person = person;
    }

    @Override
    public void doing() {
        person.doing();
    }
}
