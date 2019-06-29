package decorator.example2;

public class HeadDecorator implements Person {

    Person person;

    HeadDecorator(Person person){
        this.person = person;
    }

    @Override
    public void goOut() {
        System.out.println("戴上墨镜");
        System.out.println("戴上蓝色鸭舌帽");
        person.goOut();
        System.out.println("gai上最靓的仔");
    }
}
