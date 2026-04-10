//Input : tree
//Output : [e,t,r] or [e,r,t]
import java.util.*;
public class Alpha_Order {
    public List<Character> alpha_order(String str){
        Map<Character, Integer> map = new HashMap<>();
        //1. frequency count
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0    ) + 1);
        }
        //2. map sorted in list - List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        // map.entrySet - all the key,value pairs in the map
        List<Character> list = new ArrayList<>(map.keySet());
        //3. Sort
        Collections.sort(list,(a,b) -> map.get(b)-map.get(a));
        return list;

    }
    public static void main(String[] args) {
        Alpha_Order ao = new Alpha_Order();
        String str = "tree";        
        System.out.println(ao.alpha_order(str));
    }
}

/*
public List<Character> alpha_order(String str){
        Map<Character, Integer> map = new HashMap<>();
        //1. frequency count
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0    ) + 1);
        }
        //2. map sorted in list - List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        // map.entrySet - all the key,value pairs in the map
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        //3. Sort
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
               if(!a.getValue().equals(b.getValue())){
                    return b.getValue() - a.getValue();    
            }
                a.getKey() - b.getKey(); // if frequency is same, sort by character
        });
        List<Character> result = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : list){
            result.add(entry.getKey());
        }
        return result;
          
    }
*/
