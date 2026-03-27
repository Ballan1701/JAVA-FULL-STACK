public class waveform_pattern {
    public static String wave(String str){
        String str1= "";
        String str2 ="";

        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                str1 += ch[i] + " ";
            }
        }
        System.out.println();
        for(int i=0;i<ch.length;i++){
            if(i%2!=0){
                str2 += " "+ch[i];
            }
        }
        return (str1+"\n"+str2);
    }

    public static void main(String[] args){
        String str = "VIRATKOHLI";
        System.out.println(wave(str));
    }
}
