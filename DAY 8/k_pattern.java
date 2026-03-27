public class k_pattern {
    public static void main(String[] args){
        String str = "palindrome";
        int n = str.length();
        int space =n/2;
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(i));  
            for(int j=0;j<space;j++){
                System.out.print("_");
            }
            if(i< n/2){
                space--;
            }
            else{
                space++;
            }
            System.out.print(str.charAt(n-i-1));
            System.out.println();
        }
    }
}

