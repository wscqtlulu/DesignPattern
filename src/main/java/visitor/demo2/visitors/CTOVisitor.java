package visitor.demo2.visitors;

import visitor.demo2.datas.Staff;

public class CTOVisitor implements Visitor {
    @Override
    public String showInfo(Staff staff) {
        String ctoNeedInfo = staff.technology;
        System.out.println("cto关注的员工技术信息：" + ctoNeedInfo);
        return ctoNeedInfo;
    }
}
