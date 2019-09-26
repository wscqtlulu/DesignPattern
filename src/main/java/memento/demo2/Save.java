package memento.demo2;

/**
 * 存档
 */
public class Save {
    private String hp;
    private String mp;
    private String level;

    public Save(String hp, String mp, String level) {
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
