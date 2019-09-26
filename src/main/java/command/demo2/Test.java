package command.demo2;

/**
 * 命令类持有执行该命令的执行者
 * 指挥者持有命令并有发起命令的方法
 */
public class Test {
    public static void main(String[] args) {
        Mingge mingge = new Mingge();

        CodeCommand webCodeCommand = new CodeCommand();
        webCodeCommand.setCoder(new YuGe());
        mingge.setCommand(webCodeCommand);
        mingge.doCommand();

        CodeCommand androidCodeCommand = new CodeCommand();
        androidCodeCommand.setCoder(new LeGe());
        mingge.setCommand(androidCodeCommand);
        mingge.doCommand();
    }
}
