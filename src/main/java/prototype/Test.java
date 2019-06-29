package prototype;

/**
 * @author taotao
 *
 * 原型模式
 */
public class Test {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("1", "2", "3");

        Prototype prototypeClone = (Prototype) prototype.clone();

        prototypeClone.setValue1("4");
        prototypeClone.setValue3("6");
        print("prototype ", prototype);
        print("prototypeClone ", prototypeClone);

        prototype.setValue1("8");
        print("prototype ", prototype);
        print("prototypeClone ", prototypeClone);

    }

    public static void print(String s, Prototype prototype){
        System.out.println(s + " value1:" + prototype.getValue1() +
                " value2:" + prototype.getValue2() + " value3:" + prototype.getValue3());
    }
}
