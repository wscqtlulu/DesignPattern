package memento.demo2;

import java.util.HashMap;
import java.util.Map;

public class SaveList {
    public static Map<String, Save> saves = new HashMap();

    public void addSave(String key, Save save){
        saves.put(key,save);
    }

    public void deleteSave(String key){
        saves.remove(key);
    }

    public Save getSave(String key){
        return saves.get(key);
    }
}
