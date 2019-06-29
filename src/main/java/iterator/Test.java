package iterator;

/**
 * @author taotao
 *
 * 迭代子模式
 * 实现迭代器
 */
public class Test {

    public static void main(String[] args) {
        String[] strings = {"H", "E", "L", "L", "O"};
        Collection collection = new MyCollection(strings);
        Iterator iterator = collection.interator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("pre:" + iterator.previous());
        System.out.println("first:" + iterator.first());
    }
}
