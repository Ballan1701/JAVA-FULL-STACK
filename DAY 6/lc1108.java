public class lc1108 {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        char[] arr = address.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == '.')
                str.append("[.]");
            else
                str.append(arr[i]);    
                        
        }
        return new String(str);
    }
}

/* SIMPLIEST WAY USING BUILT-IN FUNCTION
public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    } 

*/
