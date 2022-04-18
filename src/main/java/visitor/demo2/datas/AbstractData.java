package visitor.demo2.datas;

import visitor.demo2.visitors.Visitor;

/**
 * 抽象类提供统一入口方法让访问者进入，此抽象类也可以换成接口
 */
public abstract class AbstractData {
    abstract void accept(Visitor visitor);
}
