import java.util.*;
public class map_eg {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        System.out.println(map.keySet());
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
