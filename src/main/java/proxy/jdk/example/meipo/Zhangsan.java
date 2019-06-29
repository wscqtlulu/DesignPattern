package proxy.jdk.example.meipo;

//单身狗张三
public class Zhangsan implements Person {
//    private String sex = "男";
//    private String name = "张三";


    @Override
    public void findLove() {
        System.out.printf("我叫张三，性别是男，我找对象的要求是：");
        System.out.printf("白富美");
        System.out.printf("体重55以下");
        System.out.printf("\n");
    }

//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
