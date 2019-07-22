package builder.demo1;

public class SmartHuman implements BuildHuman {
    private Human human;
    public SmartHuman(){
        human = new Human();
    }
    @Override
    public void buildHead() {
        human.setHead("250智商");
    }

    @Override
    public void buildBody() {
        human.setBody("人高马大");
    }

    @Override
    public void buildHand() {
        human.setHand("卡哇伊的大手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("小脚");
    }

    @Override
    public Human createHuman() {
        return human;
    }
}
