import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        int[] arr = {5,3,9,1,7,2};
        for (int num : arr) {
            set.add(num);
            linkedSet.add(num);
        }

        System.out.println("HashSet: " + set);
        System.out.println("LinkedHashSet: " + linkedSet);
    }
}

