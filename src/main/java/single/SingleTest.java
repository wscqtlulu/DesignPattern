package single;

import java.util.HashSet;
import java.util.Set;

public class SingleTest {
    public static void main(String[] args) {

        try {
            final Set<Single8> set = new HashSet<>();
            for (int i = 0; i < 10000; i++){
                new Thread(()->set.add(Single8.getInstance())).start();
            }
            Thread.sleep(5000);
            synchronized (set){
                System.out.println(set.size());
                if (set.size()>1){
                    System.out.println(set.size());
                    for (Single8 single: set) {
                        System.out.printf(String.valueOf(single));
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
