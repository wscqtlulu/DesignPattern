package command.demo1;

/**
 * @author taotao
 *
 * 命令模式
 * 执行命令的执行者（receiver）负责执行具体的command（命令），一个命令必须有执行者，而invoker（发布命令者）只负责发布命令，不需要知道谁来执行具体命令。
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        MyCommand command = new MyCommand(new Receiver());
        System.out.println("-----------------");
        invoker.action();
        System.out.println("-----------------");
        invoker.setCommand(command);
        invoker.action();
    }
}
