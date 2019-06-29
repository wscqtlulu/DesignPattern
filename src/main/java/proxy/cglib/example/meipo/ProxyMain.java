package proxy.cglib.example.meipo;

public class ProxyMain {

    public static void main(String[] args){

        /**
         * jdk的动态代理是通过接口来进行强制转换的
         * 生成以后的代理对象可以强制转换为接口
         *
         * cglib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
         * 生成以后的对象可以强制转换为被代理对象（也就是用自己写的类）
         * 子类引用赋值给父类
         */
        try {
            LaoWang laoWang = (LaoWang) new Meipo().getInstance(LaoWang.class);
            laoWang.findLove();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
