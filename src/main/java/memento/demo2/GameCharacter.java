package memento.demo2;

public class GameCharacter {
    private String hp;
    private String mp;
    private String level;

    public Save createSave(){
        return new Save(hp, mp, level);
    }

    public String restoreSave(Save save){
        this.hp = save.getHp();
        this.mp = save.getMp();
        this.level = save.getLevel();
        return "恢复存档成功";
    }

    public GameCharacter(String hp, String mp, String level) {
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
