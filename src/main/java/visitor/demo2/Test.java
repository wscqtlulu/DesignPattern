package visitor.demo2;

import visitor.demo2.datas.Staff;
import visitor.demo2.visitors.CEOVisitor;
import visitor.demo2.visitors.CTOVisitor;
import visitor.demo2.visitors.HRVisitor;

/**
 * 访问者模式
 * 数据结构稳定而且内部信息复杂，外部类（访问者）只想要获取自己关注信息，所以数据结构开放一个入口让访问者进入，而获取什么信息由访问者自己决定
 *
 */
public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff("tt", "T", "10", "Java");
        String ceoInfo = new CEOVisitor().showInfo(staff);
        String hrInfo = new HRVisitor().showInfo(staff);
        String ctoInfo = new CTOVisitor().showInfo(staff);
    }
}
