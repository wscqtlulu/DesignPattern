package template.demo1;

public abstract class AbstractDevelopProcess {

    /**
     * 默认开发发布流程
     */
    public final void defaultProcess(){
        develop();
        test();
        if (skipUat()) {
            pro();
        } else {
            uat();
            pro();
        }
    }

    /**
     * 子类必须实现的方法
     */
    abstract void develop();

    /**
     * 子类必须实现的方法
     */
    abstract void test();

    /**
     * 钩子方法，可以影响到模板流程
     * @return
     */
    boolean skipUat(){
        return false;
    }

    void uat(){
        System.out.println("发布UAT！");
    };

    void pro(){
        System.out.println("生产发布完成！");
    };
}
