package iterator;

public class MyCollection implements Collection {

    String[] strings;

    MyCollection(String[] strings){
        this.strings = strings;
    }

    @Override
    public Iterator interator() {
        return new MyIterator(this);
    }

    @Override
    public int size() {
        return strings.length;
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }
}
