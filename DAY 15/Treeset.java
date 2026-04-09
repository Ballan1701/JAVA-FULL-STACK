import java.util.*;
public class Treeset {
    public static void main(String[] args){
        TreeSet<Integer> tree = new TreeSet<>();
        int[] arr ={15,3,9,1,7,2}; // 1 2 3 7 9 15
        for(int i:arr){
            tree.add(i);
        }
        /*System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.higher(25));
        System.out.println(tree.lower(25));
        System.out.println(tree.ceiling(26));
        System.out.println(tree.floor(26));
         */
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt(); //if input is 7 then output is 9 is nearest no to 7.
        System.out.println(tree.higher(target));
        System.out.println(tree.lower(target));
        int fdiff = target - tree.higher(target);
        int cdiff = tree.lower(target) - target;
        if(fdiff<cdiff){
            System.out.println(tree.lower(target));
        } else{
            System.out.println(tree.higher(target));
        }
    
    }
}

