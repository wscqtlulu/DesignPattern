package visitor.demo2.visitors;

import visitor.demo2.datas.Staff;

public class CEOVisitor implements Visitor {
    @Override
    public String showInfo(Staff staff) {
        String ceoNeedInfo = staff.kpi;
        System.out.println("ceo关注的员工kpi信息：" + ceoNeedInfo);
        return ceoNeedInfo;
    }
}
