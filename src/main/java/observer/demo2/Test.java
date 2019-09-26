package observer.demo2;

public class Test {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.addPerson(new Son());
        mother.addPerson(new Daughter());
        mother.addPerson(new Father());
        mother.cook();
        mother.callEat();
    }
}
