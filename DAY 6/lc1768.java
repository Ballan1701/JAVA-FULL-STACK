public class lc1768 {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int len = w1.length+w2.length;
        char[] w = new char[len];
        int minlen = Math.min(w1.length,w2.length);
        int k=0,i=0,j=0,ind=0;
        while(ind<minlen && i<w1.length && j<w2.length)
        {
            w[k++] = w1[i++];
            w[k++] = w2[j++];
            ind++;
        
        }
        while(i<w1.length)
        {
            w[k] = w1[i++];
            k++;
        }
        while(j<w2.length)
        {
            w[k] = w2[j++];
            k++;
        }
        return new String(w);
    }
}
