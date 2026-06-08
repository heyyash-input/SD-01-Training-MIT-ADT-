package Day07.Map;

import java.util.HashMap;
import java.util.HashSet;

public class Test_HashMap {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        // Integer:-
        HashMap<Integer , String> map = new HashMap<Integer , String>();
        map.put(101, "yash");
        map.put(102, "Gham");
        map.put(103, "Sham");
        map.put(104, "Ram");
        System.out.println(map);

//---------------------------------------------------------------------------------------------------------------

        System.out.println("Key 101: " + map.get(101));
        System.out.println("Remove 101: " + map.remove(101));
        System.out.println(map);

        System.out.println("Clear");
        map.clear();
        System.out.println(map);

//---------------------------------------------------------------------------------------------------------------
        //String:
        HashMap<String , String> strMap = new HashMap<String , String>();
        strMap.put("1", "yash");
        strMap.put("2", "Gham");
        strMap.put("3", "Sham");
        strMap.put("4", "Ram");
        System.out.println(strMap);

//-----------------------------------------------------------------------------------------------------------------
    }
}
