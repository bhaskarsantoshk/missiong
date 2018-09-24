package leetcode;

import java.util.Arrays;

public class P242ValidAnagram {
    public boolean isAnagram(String s, String t) {
       char a[]=s.toCharArray();
       char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }

        return true;
    }

}
