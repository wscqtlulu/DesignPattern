package builder.demo2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person.Builder("岑", "清韬")
                .setEyesColor("黑")
                .setHairColor("红")
                .setHeight("170")
                .setWeight("57")
                .build();
        System.out.println(person);
    }
}
