//ZigZag
public class zigzag_lc6 {
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int l = s.length();
        if(l==1) System.out.println(s);
        int nr = 3;
        StringBuilder [] rows = new StringBuilder[nr];
        for(int i =0;i<nr;i++){
            rows[i] = new StringBuilder();
        }
        boolean gu = false; // gu --> going upward
        int curr = 0;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            
            if(curr == 0 || curr == nr- 1  ){
                gu = !gu;
            }
            if(gu){
                curr+= 1;
            }
            else{
            curr+= -1;}
           
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }
        System.out.println(ans.toString());

    }
}
/*
public class lc_6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int k = 2 * numRows - 2; // cycle length

        for (int row = 0; row < numRows; row++) {
            int i = row;

            while (i < n) {
                sb.append(s.charAt(i));

                // step for middle zigzag
                int step = k - 2 * row;

                if (row != 0 && row != numRows - 1 && i + step < n) {
                    sb.append(s.charAt(i + step));
                }

                i += k;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
*/