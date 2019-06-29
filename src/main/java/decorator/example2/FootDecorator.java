package decorator.example2;

public class FootDecorator implements Person {

    Person person;

    FootDecorator(Person person){
        this.person = person;
    }

    @Override
    public void goOut() {
        System.out.println("穿上AJ");
        person.goOut();
        System.out.println("gai上最潮的boy");
    }
}
