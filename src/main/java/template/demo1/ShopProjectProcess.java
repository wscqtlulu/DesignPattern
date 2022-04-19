package template.demo1;

public class ShopProjectProcess extends AbstractDevelopProcess {
    @Override
    void develop() {
        System.out.println("商城项目开发阶段进行中！");
    }

    @Override
    void test() {
        System.out.println("商城项目开发阶段进行中！");
    }

    @Override
    boolean skipUat(){
        System.out.println("商城服务没UAT环境，跳过UAT直接发布生产！");
        return true;
    }
}
