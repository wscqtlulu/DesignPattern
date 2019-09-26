package observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class Mother {
    public List<Eat> eatPersons = new ArrayList<>();

    public void addPerson(Eat eatPerson){
        eatPersons.add(eatPerson);
    }

    public void remove(Eat eatPerson){
        eatPersons.remove(eatPerson);
    }

    public void cook(){
        System.out.println("做饭" + "\n");
        System.out.println("做饭完成" + "\n");
    }

    public void callEat(){
        eatPersons.forEach(item->{
            item.callToEat();
        });
    }

}
