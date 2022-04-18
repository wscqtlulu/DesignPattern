package visitor.demo1;

public class Visitor {
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void process(BaseService service){
        System.out.println(name + "基本业务");
    }

    public void process(FundService service){
        System.out.println(name + "基金业务");
    }

    public void process(SaveService service){
        System.out.println(name + "存储业务");
    }
}
