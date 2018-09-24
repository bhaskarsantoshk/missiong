package leetcode;

import java.util.HashMap;

public class P771JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> hm= new HashMap<>();

        for (int i=0;i<S.length();i++){
            if(hm.containsKey(S.charAt(i))){
                hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
            }
            else{
                hm.put(S.charAt(i),1);
            }
        }
        int c=0;
        for (int i=0;i<J.length();i++){
            if(hm.containsKey(J.charAt(i))){
                c+=hm.get(J.charAt(i));
            }
        }
        return c;

    }
}
