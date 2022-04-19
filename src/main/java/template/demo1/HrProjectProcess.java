package template.demo1;

public class HrProjectProcess extends AbstractDevelopProcess {
    @Override
    void develop() {
        System.out.println("Hr项目开发阶段进行中！");
    }

    @Override
    void test() {
        System.out.println("Hr项目提测阶段进行中！");
    }
}
