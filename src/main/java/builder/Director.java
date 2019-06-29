package builder;

public class Director {
    public Human createHuman(BuildHuman buildHuman){
        Human human = buildHuman.createHuman();
        buildHuman.buildHead();
        buildHuman.buildBody();
        buildHuman.buildHand();
        buildHuman.buildFoot();
        return human;
    }
}
