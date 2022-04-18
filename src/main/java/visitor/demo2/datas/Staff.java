package visitor.demo2.datas;

import visitor.demo2.visitors.Visitor;

public class Staff extends AbstractData {

    public String name;
    public String kpi;
    public String workHour;
    public String technology;

    public Staff(){}

    public Staff(String name, String kpi, String workHour, String technology){
        this.name = name;
        this.kpi = kpi;
        this.workHour = workHour;
        this.technology = technology;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.showInfo(this);
    }
}
