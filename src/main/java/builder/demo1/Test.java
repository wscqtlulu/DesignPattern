package builder.demo1;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHuman(new SmartHuman());
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHand());
        System.out.println(human.getFoot());
    }
}
