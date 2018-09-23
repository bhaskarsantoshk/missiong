package leetcode;

public class P709ToLowerCase {
    public String toLowerCase(String str) {
        char[] c= str.toCharArray();
        for (int i=0;i<str.length();i++){
            if (c[i]>='A' && c[i]<='Z'){
                c[i]=(char)(c[i]-'A'+'a');
            }
        }

        String s="";
        for (int i=0;i<str.length();i++){
            s+=c[i]+"";
        }

        return s;
    }
}
