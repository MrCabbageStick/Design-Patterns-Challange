package dev.mrcabbagestick;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PC {
    private static PC instance = null;
    private Map<Integer, PCFan> fans = new HashMap<>();

    public static PC getInstance() {
        if(instance == null)
            instance = new PC();

        return instance;
    }

    public void addFan(PCFan fan){
        int id = fans.keySet().stream().max(Comparator.naturalOrder()).orElse(-1);
        System.out.println(id);
        fans.put(id + 1, fan);
    }

    public PCFan getFan(int id){
        return fans.get(id);
    }

    public Map<Integer, PCFan> getFans() {
        return fans;
    }
}
