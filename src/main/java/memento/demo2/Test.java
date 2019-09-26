package memento.demo2;

public class Test {
    public static void main(String[] args) {
        GameCharacter killer = new GameCharacter("100", "100", "1");
        killer.setHp("90");
        killer.setLevel("2");
        Save save1 = killer.createSave();
        SaveList.saves.put("存档1", save1);
        killer.setHp("88");
        killer.setMp("60");
        killer.setLevel("4");
        Save save2 = killer.createSave();
        SaveList.saves.put("存档2", save2);
        killer.setHp("77");
        killer.setMp("90");
        killer.setLevel("5");
        Save save3 = killer.createSave();
        SaveList.saves.put("存档3", save3);
        killer.restoreSave(SaveList.saves.get("存档2"));
        System.out.println("hp:" + killer.getHp());
        System.out.println("mp:" + killer.getMp());
        System.out.println("level:" + killer.getLevel());
    }
}
