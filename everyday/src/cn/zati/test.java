package cn.zati;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(22, "hhrth");
        map.put(66, "aajtjaa");
        map.put(55, "aaaa");
        map.put(77, "aaajja");
        map.put(44, "aajjjjjaa");
        map.put(2662, "aaagha");
        map.put(2332, "aayrtaa");
        map.put(53, "aaaa");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
            System.out.println(entry.getKey()+"*****"+entry.getValue());
        }
    }
}
