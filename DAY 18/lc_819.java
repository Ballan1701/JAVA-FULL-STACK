import java.util.*;
public class lc_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]"," ");
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.split("\\s+");
        Map<String,Integer> freq = new HashMap<>();
        int max=0;
        String res="";
        for(String s : words){
            if(!set.contains(s) && s.length()>0){
                freq.put(s,freq.getOrDefault(s,0)+1);
                if(freq.get(s)>max){
                    max = freq.get(s);
                    res = s;
                }
            }
        }
        return res;
    }
}
