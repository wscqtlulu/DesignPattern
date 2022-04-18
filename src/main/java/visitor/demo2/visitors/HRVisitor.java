package visitor.demo2.visitors;

import visitor.demo2.datas.Staff;

public class HRVisitor implements Visitor {
    @Override
    public String showInfo(Staff staff) {
        String hrNeedInfo = staff.workHour;
        System.out.println("hr关注的员工工时信息：" + hrNeedInfo);
        return hrNeedInfo;
    }
}
