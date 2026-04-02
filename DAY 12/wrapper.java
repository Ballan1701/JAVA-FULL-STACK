public class wrapper {
        public static void main(String[] args) {
            Integer i = Integer.valueOf("0110236");// return type ->object(Integer)
            Integer j = Integer.parseInt("009876"); // return type int(int primitive)
            int k = i;//unboxing
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            Integer x =128;
            x=130;
            System.out.println(x);
        }
}
