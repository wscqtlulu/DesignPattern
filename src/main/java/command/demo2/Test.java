package command.demo2;

/**
 * 命令类持有执行该命令的执行者
 * 指挥者持有命令并有发起命令的方法
 */
public class Test {
    public static void main(String[] args) {
        Mingge mingge = new Mingge();

        CodeCommand webCodeCommand = new CodeCommand();
        //web任务可以由宇哥做，当然也可以由克姐做
        webCodeCommand.setCoder(new YuGe());
        mingge.setCommand(webCodeCommand);
        mingge.doCommand();

        CodeCommand androidCodeCommand = new CodeCommand();
        //安卓任务可以由乐哥做，当然也可以由岿哥做
        androidCodeCommand.setCoder(new LeGe());
        mingge.setCommand(androidCodeCommand);
        mingge.doCommand();
    }
}
