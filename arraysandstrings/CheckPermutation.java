package missiong.arraysandstrings;

public class CheckPermutation {

    public static void main(String []args){
        String s1="GoogleFacebookMicroSoft";
        String s2="FacebookMicroSoftGoogle";
        System.out.println(checkPermutation(s1,s2));
    }

    public static boolean checkPermutation(String s1, String s2){
         s1=s1.toLowerCase();
         s2=s2.toLowerCase();
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            b[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
